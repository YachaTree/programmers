class Solution {
    public int solution(String my_string) { String[] parts = my_string.split(" ");
        int result = Integer.parseInt(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            int num = Integer.parseInt(parts[i + 1]);
            if (parts[i].equals("+")) {
                result += num;
            } else if (parts[i].equals("-")) {
                result -= num;
            }
        }

        return result;
    }
}