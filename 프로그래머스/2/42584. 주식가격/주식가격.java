import java.io.*;
import java.util.*;

class Solution {
    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장하는 스택

        for (int i = 0; i < n; i++) {
            // 현재 가격이 스택에 저장된 인덱스의 가격보다 작으면
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop(); // 스택에서 꺼낸 인덱스
                answer[idx] = i - idx; // 현재 시점과 꺼낸 시점 차이 계산
            }
            stack.push(i); // 현재 인덱스를 스택에 저장
        }

        // 스택에 남아 있는 인덱스 처리 (끝까지 떨어지지 않은 경우)
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx; // 끝까지 가격이 떨어지지 않았음
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] prices = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        
        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
    }
}
