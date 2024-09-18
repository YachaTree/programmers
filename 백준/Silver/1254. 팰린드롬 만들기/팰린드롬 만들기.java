import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int minLength = getShortestPalindromeLength(s);
        System.out.println(minLength);
    }


    private static int getShortestPalindromeLength(String s) {
        int n = s.length();
        

        for (int i = 0; i < n; i++) {
            if (isPalindrome(s, i, n - 1)) {
                return n + i;
            }
        }
        return 2 * n - 1; 
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
