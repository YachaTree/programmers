import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerRank = new HashMap<>();
        Map<Integer, String> rankPlayer = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i);
            rankPlayer.put(i, players[i]);
        }
        
        for (String call : callings) {
            int currentRank = playerRank.get(call);
            int prevRank = currentRank - 1;
            String prevPlayer = rankPlayer.get(prevRank);
            
            playerRank.put(call, prevRank);
            playerRank.put(prevPlayer, currentRank);
            rankPlayer.put(prevRank, call);
            rankPlayer.put(currentRank, prevPlayer);
        }
        
        String[] result = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            result[i] = rankPlayer.get(i);
        }
        
        return result;
    }
}
