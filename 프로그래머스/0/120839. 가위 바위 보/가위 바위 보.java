class Solution {
    public String solution(String rsp) {
               StringBuilder answer = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            switch(ch) {
                case '2': // 가위
                    answer.append('0'); // 바위
                    break;
                case '0': // 바위
                    answer.append('5'); // 보
                    break;
                case '5': // 보
                    answer.append('2'); // 가위
                    break;
            }
        }

        return answer.toString();
    }
}