class Solution {
    public int solution(int a, int b, int n) {
        int totalCokes = 0;
        
        while (n >= a) {
            int newCokes = (n / a) * b;
            totalCokes += newCokes;
            n = (n % a) + newCokes;
        }
        
        return totalCokes;
    }
}