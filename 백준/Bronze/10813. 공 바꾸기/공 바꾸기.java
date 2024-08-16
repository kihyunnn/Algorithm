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
            arr[i] = i+1;
        }

        for (int l = 0 ; l< m ; l++ ){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            i--;
            j--;
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}