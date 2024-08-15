import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result  = a/b ;
//        String resultStr = Double.toString(result);

//        System.out.println(resultStr);
        System.out.println(a/b);
    }
}
