import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // 처음 값으로 초기화
        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        // 넓이 계산
        int area = (maxX - minX) * (maxY - minY);
        System.out.println(area);
    }
}
