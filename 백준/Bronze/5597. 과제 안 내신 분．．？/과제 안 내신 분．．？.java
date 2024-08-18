import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] arr;
        arr = new int [30]; //배열 생성

        //배열 초기화
        for (int i = 0 ; i < 30 ; i++){
            arr[i] = 0;
        }

        for (int i = 0 ; i < 28 ; i ++){
            int n = scanner.nextInt();
            n = n - 1;
            for(int k = 0 ; k<30 ; k ++){
                if(k == n){
                    arr[k] = 1;
                }
            }
        }
        for(int i = 0 ; i < 30 ; i++){
            if(arr[i]==0){
                System.out.println(i+1);
            }
        }
    }
}