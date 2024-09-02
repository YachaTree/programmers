import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 주사위 눈 3개를 정수형으로 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int prize = 0;

        // 같은 눈이 3개가 나오는 경우
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        }
        // 같은 눈이 2개만 나오는 경우
        else if (a == b || a == c) {
            prize = 1000 + a * 100;
        }
        else if (b == c) {
            prize = 1000 + b * 100;
        }
        // 모두 다른 눈이 나오는 경우
        else {
            prize = Math.max(a, Math.max(b, c)) * 100;
        }

        // 상금을 출력
        System.out.println(prize);
    }
}
