import java.util.*;

class Solution {
    public static int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] giftMatrix = new int[n][n];
        int[] giftGiven = new int[n];
        int[] giftReceived = new int[n];

        Map<String, Integer> friendIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            friendIndex.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = friendIndex.get(parts[0]);
            int receiver = friendIndex.get(parts[1]);
            giftMatrix[giver][receiver]++;
            giftGiven[giver]++;
            giftReceived[receiver]++;
        }

        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = giftGiven[i] - giftReceived[i];
        }

        // 다음 달 선물 계산
        int[] nextMonthGifts = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftMatrix[i][j] > giftMatrix[j][i]) {
                    nextMonthGifts[i]++;
                } else if (giftMatrix[i][j] < giftMatrix[j][i]) {
                    nextMonthGifts[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }

        int maxGifts = 0;
        for (int giftsReceived : nextMonthGifts) {
            maxGifts = Math.max(maxGifts, giftsReceived);
        }

        return maxGifts;
    }

}
