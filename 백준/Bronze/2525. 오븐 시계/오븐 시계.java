import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m  = scanner.nextInt();
        int c = scanner.nextInt();

        m += c;
        h =  h + (m/60);
        if (h >= 24) {
            h = h - 24;
        }
        m = m % 60;

        System.out.println(h + " " + m);


    }
}