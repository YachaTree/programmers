class Solution {
    public String solution(String polynomial) {
        int number = 0; // 상수항
        int num = 0;    // 변수항
        String[] arr = polynomial.split(" ");

        for (String s : arr) {
            if (!s.equals("+")) {
                if (s.contains("x")) {
                    // 'x' 항의 처리
                    s = s.replace("x", "");
                    num += s.isEmpty() ? 1 : Integer.parseInt(s);
                } else {
                    number += Integer.parseInt(s);
                }
            }
        }

        // 결과 형식 구성
        String answer = "";
        if (num > 0) {
            answer = (num == 1) ? "x" : num + "x";
        }
        if (number > 0) {
            if (!answer.isEmpty()) {
                answer += " + ";
            }
            answer += number;
        }

        return answer.isEmpty() ? "0" : answer;
    }
}
