import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int R, C, K;
    static char[][] map;
    static boolean[][] visited;
    static int count = 0;
    static int[] dx = {0, 0, -1, 1}; 
    static int[] dy = {-1, 1, 0, 0}; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] rc = br.readLine().split(" ");
        R = Integer.parseInt(rc[0]);
        C = Integer.parseInt(rc[1]);
        K = Integer.parseInt(rc[2]);

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }


        visited[R - 1][0] = true;
        dfs(R - 1, 0, 1);

        System.out.println(count);
    }

    public static void dfs(int x, int y, int dist) {
     
        if (x == 0 && y == C - 1 && dist == K) {
            count++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && map[nx][ny] != 'T') {
                visited[nx][ny] = true;
                dfs(nx, ny, dist + 1);
                visited[nx][ny] = false; 
            }
        }
    }
}
