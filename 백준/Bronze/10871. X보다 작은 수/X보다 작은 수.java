import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int [] arr;
        arr = new int [n]; //배열 생성

        for(int i = 0 ; i < n ; i++){
            int k = scanner.nextInt();
            arr[i] = k ;
        }

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(x > arr[i]){
                System.out.print(arr[i] + " ");
            }
        }


    }
}