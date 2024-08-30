import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 막대의 길이를 입력받음
        int[] sticks = new int[3];
        sticks[0] = sc.nextInt();
        sticks[1] = sc.nextInt();
        sticks[2] = sc.nextInt();

        // 막대의 길이를 오름차순으로 정렬
        Arrays.sort(sticks);

        // 가장 긴 막대의 길이를 조정하여 삼각형을 만듦
        if (sticks[0] + sticks[1] <= sticks[2]) {
            sticks[2] = sticks[0] + sticks[1] - 1;
        }

        // 삼각형의 둘레 계산
        int perimeter = sticks[0] + sticks[1] + sticks[2];
        System.out.println(perimeter);
    }
}
