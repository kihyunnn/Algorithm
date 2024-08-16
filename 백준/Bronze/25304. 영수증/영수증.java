import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int amount  = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i<amount ;i ++){
            int price_p = scanner.nextInt();
            int amount_p  = scanner.nextInt();
            sum += price_p * amount_p;
        }

        System.out.println(price == sum ? "Yes" : "No");
    }
}