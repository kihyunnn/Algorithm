import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt(); // 거스름돈의 액수
            int quarters = C / 25; // 쿼터의 개수
            C %= 25; // 나머지
            int dimes = C / 10; // 다임의 개수
            C %= 10; // 나머지
            int nickels = C / 5; // 니켈의 개수
            C %= 5; // 나머지
            int pennies = C; // 페니의 개수

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}
