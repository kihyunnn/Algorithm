import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        int n = Integer.parseInt(sc.nextLine());  // 정수 입력
        String str = sc.nextLine();  // 문자열 입력

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - '0';  // 문자 -> 숫자로 변환
            sum += num;  // 변환한 숫자를 합산
        }
        System.out.println(sum);

        sc.close(); // 스캐너 닫기
    }
}
