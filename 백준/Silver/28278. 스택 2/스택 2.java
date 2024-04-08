import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N]; // 정수를 저장할 스택 배열
        int size = 0; // 스택의 현재 크기

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            switch (line.charAt(0)) {
                case '1': // '1 X' 명령: 정수 X를 스택에 넣는다.
                    int number = Integer.parseInt(line.substring(2));
                    stack[size++] = number;
                    break;
                case '2': // '2' 명령: 스택의 맨 위 정수를 빼고 출력한다.
                    if (size == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack[--size] + "\n");
                    }
                    break;
                case '3': // '3' 명령: 스택에 있는 정수의 개수를 출력한다.
                    bw.write(size + "\n");
                    break;
                case '4': // '4' 명령: 스택이 비어있으면 1, 아니면 0을 출력한다.
                    bw.write((size == 0 ? "1" : "0") + "\n");
                    break;
                case '5': // '5' 명령: 스택에 정수가 있다면 맨 위의 정수를 출력한다.
                    if (size == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack[size - 1] + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
