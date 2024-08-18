import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for(int i = 0; i < m ; i++){
            int j = sc.nextInt();
            j -= 1;
            int k = sc.nextInt();
            k -= 1;
            if(j == k){
                continue;
            }
            int num = (k-j)/2;
            for(int l = 0 ; l <= num ; l ++){
                int temp;
                temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }

        }

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}