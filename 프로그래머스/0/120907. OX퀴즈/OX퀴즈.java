class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" ");
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);

            if (operator.equals("+") && X + Y == Z || operator.equals("-") && X - Y == Z) {
                result[i] = "O";
            } else {
                result[i] = "X";
            }
        }
 
        return result; 
    }
}