class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] safe = new boolean[n][n];

        // 전체 지역을 처음에 안전하다고 가정
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                safe[i][j] = true;
            }
        }

        // 지뢰 주변의 지역을 위험하다고 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    markUnsafeAreas(safe, i, j);
                }
            }
        }

        // 안전한 지역의 수 세기
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (safe[i][j]) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }

    private void markUnsafeAreas(boolean[][] safe, int x, int y) {
        int n = safe.length;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i >= 0 && x + i < n && y + j >= 0 && y + j < n) {
                    safe[x + i][y + j] = false;
                }
            }
        }
    }
}