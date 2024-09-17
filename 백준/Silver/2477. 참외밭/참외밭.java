import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int K = Integer.parseInt(br.readLine());
        
        int[] dir = new int[6];
        int[] len = new int[6];
        
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dir[i] = Integer.parseInt(st.nextToken()); // 방향 
            len[i] = Integer.parseInt(st.nextToken()); // 길이
        }
        

        int bigWidth = 0, bigHeight = 0, smallWidth = 0, smallHeight = 0;
        

        for (int i = 0; i < 6; i++) {
            if (dir[i] == 1 || dir[i] == 2) { // 동쪽 또는 서쪽
                if (bigWidth < len[i]) bigWidth = len[i];
            } else if (dir[i] == 3 || dir[i] == 4) { // 남쪽 또는 북쪽
                if (bigHeight < len[i]) bigHeight = len[i];
            }
        }
        

        for (int i = 0; i < 6; i++) {
            if (dir[i] == dir[(i + 2) % 6] && dir[(i + 1) % 6] == dir[(i + 3) % 6]) {
                smallWidth = len[(i + 1) % 6];
                smallHeight = len[(i + 2) % 6];
                break;
            }
        }
        
        int area = (bigWidth * bigHeight) - (smallWidth * smallHeight);
        
        System.out.println(area * K);
    }
}
