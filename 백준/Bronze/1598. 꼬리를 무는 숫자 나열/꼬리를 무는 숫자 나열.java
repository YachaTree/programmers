import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        int row1 = (num1 - 1) / 4;
        int col1 = (num1 - 1) % 4;

        int row2 = (num2 - 1) / 4;
        int col2 = (num2 - 1) % 4;

        int distance = Math.abs(row1 - row2) + Math.abs(col1 - col2);

        System.out.println(distance);
    }
}