import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = 0;
        k = n/4;
        for (int i = 0; i<k ;i ++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}