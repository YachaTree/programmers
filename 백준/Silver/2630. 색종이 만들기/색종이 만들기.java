import java.io.*;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(row[j]);
            }
        }

        cutPaper(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void cutPaper(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;

        cutPaper(x, y, newSize);
        cutPaper(x, y + newSize, newSize);
        cutPaper(x + newSize, y, newSize);
        cutPaper(x + newSize, y + newSize, newSize);
    }

    public static boolean checkColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }
}
