import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cardCountMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(cardCountMap.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        bw.write(sb.toString().trim());
        bw.flush();

        br.close();
        bw.close();
    }
}
