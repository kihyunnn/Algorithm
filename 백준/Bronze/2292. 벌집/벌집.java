import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        int n = sc.nextInt();

        int count = 1;
        int range = 2;
        
        if(n==1){
            System.out.println(1);            
        } else{
            while (range<=n){
                range += 6*count;
                count++;
            }
            System.out.println(count);
        }


    }
}
