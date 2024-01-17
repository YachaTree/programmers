
import java.util.Arrays;

class Solution {

    public int[][] solution(int[] numList, int n) {
        
        int numRows = numList.length / n;
        
        
        int[][] result = new int[numRows][n];
        
        
        for (int i = 0; i < numList.length; i++) {
            result[i / n][i % n] = numList[i];
        }
        
        return result;
    }
}