import java.io.*;
import java.util.*;

public class Solution {

    public static int solution(int n, int w, int num) {
        int totalRows = (n + w - 1) / w;
        int[] rowCounts = new int[totalRows];

        for (int r = 0; r < totalRows; r++) {
            if (r == totalRows - 1) {
                int lastCount = n - r * w;
                rowCounts[r] = (lastCount == 0 ? w : lastCount);
            } else {
                rowCounts[r] = w;
            }
        }

        int targetRow = (num - 1) / w;
        int indexInRow = (num - 1) % w;
        int targetCol = 0;

        if (targetRow % 2 == 0) {
            targetCol = indexInRow;
        } else {
            if (rowCounts[targetRow] == w) {
                targetCol = (w - 1) - indexInRow;
            } else {
                targetCol = (w - rowCounts[targetRow]) + indexInRow; 
            }
        }

        int count = 1; 

        for (int r = targetRow + 1; r < totalRows; r++) {
            int countInRow = rowCounts[r];
            if (r % 2 == 0) {
                if (targetCol < countInRow) {
                    count++;
                }
            } else {
                if (countInRow == w) {
                    count++;
                } else {
                    if (targetCol >= (w - countInRow) && targetCol < w) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
