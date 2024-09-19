import java.io.*;
import java.util.*;

public class Main {
    // 방향 배열: 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] field;
    static boolean[][] visited;
    static int M, N, K;  // 가로 M, 세로 N, 배추 개수 K
    
    // DFS 함수
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        
        // 상하좌우 네 방향으로 인접한 배추 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 배열 범위를 벗어나지 않고, 배추가 있고, 방문하지 않았다면 DFS
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (field[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // 테스트 케이스 수 입력
        int T = Integer.parseInt(br.readLine());
        
        // 테스트 케이스 반복
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());  // 가로 길이
            N = Integer.parseInt(st.nextToken());  // 세로 길이
            K = Integer.parseInt(st.nextToken());  // 배추 개수
            
            field = new int[M][N];
            visited = new boolean[M][N];
            
            // 배추가 심어진 위치 입력
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }
            
            int wormCount = 0;  // 필요한 배추흰지렁이 수
            
            // 배추밭을 탐색하면서 인접한 배추들을 묶기
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    // 배추가 있고 아직 방문하지 않았다면 DFS 시작
                    if (field[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        wormCount++;  // 새로운 배추흰지렁이 필요
                    }
                }
            }
            
            // 결과 출력
            System.out.println(wormCount);
        }
    }
}
