import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m  = scanner.nextInt();

        if (m >= 45){
            m = m - 45;
            System.out.println(h + " " + m);
        } else {
            m = m - 45 ;
            m = m + 60;
            if (h == 0){
                h = 23;
            } else {
                h--;
            }
            System.out.println(h + " " + m);
        }

    }
}