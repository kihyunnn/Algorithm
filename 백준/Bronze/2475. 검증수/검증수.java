import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스

//        int n = sc.nextInt();

        double [] arr = new double[5];
        int num = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i <5 ; i++){
            sum += (arr[i])*(arr[i]);
        }
        num = sum % 10;
        System.out.println(num);
    }
}