import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int B3 = B % 10;
        int B3Cir =  B3 * A ;

        int B4 = (B / 10) % 10 ;
        int B4Cir = B4 * A;

        int B5 = B / 100 ;
        int B5Cir = B5 * A;

        System.out.println(B3Cir);
        System.out.println(B4Cir);
        System.out.println(B5Cir);
        System.out.println(A * B);

    }
}