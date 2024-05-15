import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int S1 = Integer.parseInt(inputs[0]);
        int S2 = Integer.parseInt(inputs[1]);
        int S3 = Integer.parseInt(inputs[2]);


        int[] frequency = new int[S1 + S2 + S3 + 1];


        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = i + j + k;
                    frequency[sum]++;
                }
            }
        }


        int maxFrequency = 0;
        int result = 0;
        for (int i = 3; i <= S1 + S2 + S3; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}
