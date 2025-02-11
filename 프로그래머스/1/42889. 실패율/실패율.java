import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reached = new int[N + 2]; 
        int[] notCleared = new int[N + 2]; 
        
        for (int stage : stages) {
            notCleared[stage]++;
        }

        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            reached[i] = totalPlayers;
            totalPlayers -= notCleared[i];
        }

        List<StageFailure> failureRates = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            double failureRate = reached[i] == 0 ? 0 : (double) notCleared[i] / reached[i];
            failureRates.add(new StageFailure(i, failureRate));
        }

        Collections.sort(failureRates, (a, b) -> 
            b.failureRate == a.failureRate ? Integer.compare(a.stage, b.stage) : Double.compare(b.failureRate, a.failureRate)
        );

        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).stage;
        }

        return answer;
    }

    class StageFailure {
        int stage;
        double failureRate;

        StageFailure(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }
}
