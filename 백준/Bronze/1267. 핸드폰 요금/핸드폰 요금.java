import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] callTimes = br.readLine().split(" ");

        int yCost = 0;
        int mCost = 0;

        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(callTimes[i]);

            yCost += ((time / 30) + 1) * 10;

            mCost += ((time / 60) + 1) * 15;
        }

        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }

        br.close();
    }
}