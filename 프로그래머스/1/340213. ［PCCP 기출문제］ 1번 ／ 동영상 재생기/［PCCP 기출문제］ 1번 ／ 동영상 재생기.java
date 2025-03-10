import java.io.*;

public class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = toSeconds(video_len);
        int curPos = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);

        curPos = skipOpening(curPos, opStart, opEnd);

        for (String cmd : commands) {
            if ("prev".equals(cmd)) {
                curPos = Math.max(curPos - 10, 0);
            } else if ("next".equals(cmd)) {
                curPos = Math.min(curPos + 10, videoLen); 
            }

            curPos = skipOpening(curPos, opStart, opEnd);
        }

        return formatTime(curPos);
    }

    private static int skipOpening(int curPos, int opStart, int opEnd) {
        if (curPos >= opStart && curPos <= opEnd) {
            return opEnd;
        }
        return curPos;
    }

    private static int toSeconds(String time) {
        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        return min * 60 + sec;
    }

    private static String formatTime(int seconds) {
        return String.format("%02d:%02d", seconds / 60, seconds % 60);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String video_len = br.readLine();
        String pos = br.readLine();
        String op_start = br.readLine();
        String op_end = br.readLine();
        String[] commands = br.readLine().split(",");

        System.out.println(solution(video_len, pos, op_start, op_end, commands));
    }
}
