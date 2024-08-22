import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        String str = sc.nextLine();

        int[] arr = new int[26];

        // 문자열 배열에 넣기
        int[] arrStr = new int[str.length()];
        for(int i = 0; i<26 ; i++){
            arr[i] = -1;
        }
        for(int i = 0 ; i <str.length() ; i++){
            arrStr[i]= str.charAt(i) - 'a';
        }



        for(int i = 0 ; i<26 ; i++){
            for(int k = 0 ; k < str.length() ; k++){
                if(i== arrStr[k] && arr[i] == -1){
                    arr[i] = k ;
                }
            }

        }
        for (int i = 0 ; i<26 ; i++){
            System.out.print(arr[i]+" ");
        }




    }
}
