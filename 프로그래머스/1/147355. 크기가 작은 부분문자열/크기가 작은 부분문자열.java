class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int lenP = p.length();
        long pValue = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - lenP; i++) {
            String sub = t.substring(i, i + lenP);
            long subValue = Long.parseLong(sub);
            
            if (subValue <= pValue) {
                count++;
            }
        }
        
        return count;
    }
}
