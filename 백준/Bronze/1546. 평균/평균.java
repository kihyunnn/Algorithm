import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 받기 위한 스캐너 클래스

        int n = sc.nextInt();

        double [] arr = new double[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double  max = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }

        double sum = 0.0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]= arr[i]/(double)max*100;
            sum +=arr[i];
        }
        double ave =0;
        ave = sum/arr.length;
        System.out.println(ave);
    }
}