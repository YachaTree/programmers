import java.util.*;

class Solution {
    public static int[] solution(String[] park, String[] routes) {

        int startX = 0, startY = 0;

        int height = park.length;
        int width = park[0].length();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        Map<String, int[]> directions = new HashMap<>();
        directions.put("N", new int[]{-1, 0});
        directions.put("S", new int[]{1, 0});
        directions.put("W", new int[]{0, -1});
        directions.put("E", new int[]{0, 1});

        int currentX = startX;
        int currentY = startY;

        for (String route : routes) {
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            int[] move = directions.get(direction);
            int nextX = currentX;
            int nextY = currentY;

            boolean validMove = true;

            for (int step = 0; step < distance; step++) {
                nextX += move[0];
                nextY += move[1];

                if (nextX < 0 || nextX >= height || nextY < 0 || nextY >= width || park[nextX].charAt(nextY) == 'X') {
                    validMove = false;
                    break;
                }
            }

            if (validMove) {
                currentX = nextX;
                currentY = nextY;
            }
        }

        return new int[]{currentX, currentY};
    }
}
