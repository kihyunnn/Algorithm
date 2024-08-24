import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        String a = sc.next();
        String b = sc.next();
        int a_;
        int b_;
        String a_p;
        String b_p;

        a_p = ""+ a.charAt(2) + a.charAt(1) + a.charAt(0);

        b_p = ""+ b.charAt(2) + b.charAt(1) + b.charAt(0);


        a_ = Integer.parseInt(a_p);
        b_ = Integer.parseInt(b_p);

        if(a_ > b_){
            System.out.println(a_);
        } else {
            System.out.println(b_);
        }



    }
}
