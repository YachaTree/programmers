import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 수열의 길이 n 입력 받기
        int[] sequence = new int[n]; // 입력받을 수열 저장할 배열

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine()); // 수열 입력 받기
        }

        StringBuilder sb = new StringBuilder(); // 연산 결과를 저장할 StringBuilder
        Stack<Integer> stack = new Stack<>(); // 정수를 저장할 스택
        int num = 1; // 스택에 push할 현재 숫자
        boolean isPossible = true; // 수열을 만들 수 있는지 여부

        for (int i = 0; i < n; i++) {
            int current = sequence[i]; // 현재 만들어야 하는 수열의 수
            if (num <= current) { // 현재 숫자를 스택에 push해야 할 경우
                while (num <= current) {
                    stack.push(num++);
                    sb.append("+\n"); // push 연산 기록
                }
            }
            if (stack.peek() == current) { // 스택의 top에 있는 숫자가 현재 숫자와 같을 경우
                stack.pop();
                sb.append("-\n"); // pop 연산 기록
            } else { // 수열을 만들 수 없는 경우
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.println(sb.toString()); // 가능한 경우 연산 결과 출력
        } else {
            System.out.println("NO"); // 불가능한 경우 NO 출력
        }
    }
}