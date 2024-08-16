import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = n ; i > 0  ; i--){
            for (int k = 1 ; k < i ; k ++){
                System.out.print(" ");

            }
            for (int k = 0 ; k <= n- i ; k++){
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}