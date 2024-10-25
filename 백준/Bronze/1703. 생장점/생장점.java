import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = br.readLine()).equals("0")) {
                String[] input = line.split(" ");
                int age = Integer.parseInt(input[0]);

                int leaves = 1; // 초기 잎의 수는 1
                int index = 1;
                for (int i = 0; i < age; i++) {
                    int splitFactor = Integer.parseInt(input[index++]);
                    int prunedBranches = Integer.parseInt(input[index++]);
                    leaves = leaves * splitFactor - prunedBranches;
                }

                System.out.println(leaves);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}