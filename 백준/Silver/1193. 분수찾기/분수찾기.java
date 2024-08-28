import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int diagonal = 1; // 대각선 번호
        int sum = 0; // 대각선의 분수 개수의 합

        while (true) {
            sum += diagonal; // 현재 대각선에 있는 분수의 총 개수
            if (X <= sum) { // X번째가 현재 대각선 안에 있다면
                break;
            }
            diagonal++;
        }

        int positionInDiagonal = X - (sum - diagonal);

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
