import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = scanner.nextInt();

        int [] arr;
        arr = new int [9]; //배열 생성

        for(int i = 0 ; i < 9 ; i++){
            int k = scanner.nextInt();
            arr[i] = k ;
        } // 배열 입력 받는 반복문
        int max = arr[0];
        int num = 1;
        for(int i = 0 ; i < 9 ; i++){
            if(arr[i] > max){
                max = arr[i];
                num = i+1;
            }

        }
        System.out.println(max);
        System.out.println(num);



    }
}