import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스








        while(true){
            String str_p = "";
            String str = "";
            str = sc.next();
            if(str.equals("0")){
                break;
            }
            int n = str.length();
            for(int i = n-1 ; i >=0  ; i --){
                str_p += "" + str.charAt(i);
            }
            if(str.equals(str_p) ){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }
}
