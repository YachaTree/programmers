import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        String[] currentTime = br.readLine().split(" ");
        int currentHour = Integer.parseInt(currentTime[0]);
        int currentMinute = Integer.parseInt(currentTime[1]);
        int currentSecond = Integer.parseInt(currentTime[2]);
        

        int cookingTime = Integer.parseInt(br.readLine());
        

        int totalSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond + cookingTime;
        

        int finalHour = (totalSeconds / 3600) % 24; // 시
        int finalMinute = (totalSeconds / 60) % 60; // 분
        int finalSecond = totalSeconds % 60;        // 초
        

        System.out.println(finalHour + " " + finalMinute + " " + finalSecond);
    }
}
