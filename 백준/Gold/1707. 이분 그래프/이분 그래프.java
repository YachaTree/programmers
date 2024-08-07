import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            
            List<Integer>[] graph = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                graph[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }
            
            int[] color = new int[V + 1];
            boolean isBipartite = true;
            
            for (int i = 1; i <= V; i++) {
                if (color[i] == 0) {
                    if (!bfs(graph, color, i)) {
                        isBipartite = false;
                        break;
                    }
                }
            }
            
            System.out.println(isBipartite ? "YES" : "NO");
        }
    }
    
    public static boolean bfs(List<Integer>[] graph, int[] color, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 1; // 1로 칠함
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            for (int neighbor : graph[node]) {
                if (color[neighbor] == 0) {
                    color[neighbor] = -color[node]; // 반대 색으로 칠함
                    queue.add(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
