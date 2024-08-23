import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        // 입력 문자열의 앞뒤 공백 제거
        str = str.trim();

        // 공백만 있는 경우 단어 수는 0
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            // 공백을 기준으로 문자열 분리
            String[] words = str.split(" ");
            // 단어 개수 출력
            System.out.println(words.length);
        }
    }
}
