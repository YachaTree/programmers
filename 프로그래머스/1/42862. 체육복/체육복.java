import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> reserveList = new ArrayList<>();
        List<Integer> lostList = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int r : reserve) {
            if (Arrays.stream(lost).anyMatch(l -> l == r)) {
                continue;
            }
            reserveList.add(r);
        }

        for (int l : lost) {
            if (Arrays.stream(reserve).anyMatch(r -> r == l)) {
                continue;
            }
            lostList.add(l);
        }

        int count = n - lostList.size();

        for (int l : lostList) {
            if (reserveList.contains(l - 1)) {
                reserveList.remove(Integer.valueOf(l - 1));
                count++;
            } else if (reserveList.contains(l + 1)) {
                reserveList.remove(Integer.valueOf(l + 1));
                count++;
            }
        }

        return count;
    }
}
