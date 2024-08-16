import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] arr;
        arr = new int [n]; //배열 생성

        for(int i = 0 ; i < n ; i++){
            int k = scanner.nextInt();
            arr[i] = k ;
        } // 배열 입력 받는 반복문

        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] <  min){
                min = arr[i];
            }
        }
        System.out.print(min+ " "+ max);
        scanner.close(); // Scanner 닫기


    }
}