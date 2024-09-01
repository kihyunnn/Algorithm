import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int diagonal = 1;
        int cumulative = 0;

        // X가 포함될 대각선 찾기
        while (X > cumulative + diagonal) {
            cumulative += diagonal;
            diagonal++;
        }

        // 대각선 내에서 X의 위치
        int positionInDiagonal = X - cumulative;

        int numerator, denominator;

        if (diagonal % 2 == 0) {
            numerator = positionInDiagonal;
            denominator = diagonal - positionInDiagonal + 1;
        } else {
            numerator = diagonal - positionInDiagonal + 1;
            denominator = positionInDiagonal;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
