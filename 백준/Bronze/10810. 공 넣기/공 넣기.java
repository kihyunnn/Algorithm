import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [] arr;
        arr = new int [n]; //배열 생성

        //배열 초기화
        for (int i = 0 ; i < n ; i++){
            arr[i] = 0;
        }

        for (int l = 0 ; l< m ; l++ ){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            i--;
            j--;
            for (int p = 0 ; p <= j-i ; p++ ){
                arr[i+p] = k;

            }
        }

        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}