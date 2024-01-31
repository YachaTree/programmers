class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ "); // 항들을 분리
        int xCoefficient = 0; // x의 계수
        int constant = 0; // 상수항

        for (String term : terms) {
            if (term.contains("x")) {
                // x 항 처리
                term = term.replace("x", "").trim(); // 'x' 제거
                xCoefficient += term.isEmpty() ? 1 : Integer.parseInt(term);
            } else {
                // 상수항 처리
                constant += Integer.parseInt(term.trim());
            }
        }

        StringBuilder result = new StringBuilder();
        if (xCoefficient != 0) {
            result.append(xCoefficient == 1 ? "x" : xCoefficient + "x");
        }
        if (constant != 0) {
            if (result.length() > 0) result.append(" + ");
            result.append(constant);
        }

        return result.length() > 0 ? result.toString() : "0";
    }
}
