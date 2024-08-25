import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        int n = sc.nextInt();
        int count = 0 ;
        int par = 0;
        for(int i = 0 ; i < n ; i ++){
            int k = sc.nextInt();
            par = 0;
            if(k!=1){
                for(int j = 1 ; j <= k ; j++){
                    if(k%j==0){
                        par++;
                    }
                }
            }
            if(par == 2){
                count++;
            }
        }

        System.out.println(count);


    }
}
