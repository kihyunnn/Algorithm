import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너 클래스

        int n = sc.nextInt(); // 테스트 케이스의 개수
        sc.nextLine(); // 개행 문자 제거
        String[] arrStr = new String[n];
        // 배열 초기화

        for(int i = 0 ; i < n ; i++){
            arrStr[i] = "";
            int k = sc.nextInt();
            String s = sc.next();
            for(int j = 0 ; j < s.length()  ; j++){
                for (int l = 0; l < k; l++) {
                    arrStr[i] += s.charAt(j);
//                    System.out.println("arrstr " + i + "는" + arrStr[i]);
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arrStr[i]);
        }





    }
}
