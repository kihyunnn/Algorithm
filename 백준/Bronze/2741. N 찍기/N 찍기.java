import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스

        int n = sc.nextInt();

//        int [] arr = new int[5];
//        int num = 0;
//        int sum = 0;
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(i+1);
        }
    }
}