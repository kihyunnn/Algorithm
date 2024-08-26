import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            boolean bool;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a == 0 && b == 0 && c == 0){
                break;
            }
            if(a >= b&& a >= c){
                bool = a*a == b*b + c*c;
                if(bool){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else if(b >= a && b >= c){
                bool = b*b == a*a + c*c;
                if(bool){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }else if(c >= a && c >=b){
                bool = c*c == b*b + a*a;
                if(bool){
                    System.out.println("right");
                }else{
                    System.out.println("wrong");
                }
            }
        }
    }
}
