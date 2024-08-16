import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for (int k = 0 ; k < i ; k ++){
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}