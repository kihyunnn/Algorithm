import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b) {
            if (a == c){
                System.out.println((10000+a*1000));
            } else {
                System.out.println((1000 + a * 100));
            }
        }
        if (b == c && b != a) {
            System.out.println((1000 + b * 100));
        }
        if (c == a && c != b) {
            System.out.println((1000 + c * 100));
        }
        //셋다다를때
        if (a!=b && b!=c && a!=c){
            if(a>b && a>c){
                System.out.println(a*100);
            } else if ((b>a && b>c)){
                System.out.println(b*100);
            } else {
                System.out.println(c*100);
            }
        }
    }
}