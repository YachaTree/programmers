import java.util.Stack;

class Solution {
    public int solution(String s) {
        String[] elements = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String element : elements) {
            if (element.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(element));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}