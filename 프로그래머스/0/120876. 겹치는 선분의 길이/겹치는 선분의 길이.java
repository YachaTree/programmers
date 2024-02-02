import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        // 모든 점들을 시작점과 끝점으로 구분하여 저장
        int[] points = new int[lines.length * 2];
        for (int i = 0; i < lines.length; i++) {
            points[i * 2] = lines[i][0]; // 시작점
            points[i * 2 + 1] = lines[i][1]; // 끝점
        }

        // 모든 점들을 정렬
        Arrays.sort(points);

        // 겹치는 구간의 길이를 계산
        int overlapLength = 0;
        for (int i = 1; i < points.length; i++) {
            int start = points[i - 1];
            int end = points[i];
            int count = 0; // 시작점과 끝점 사이에 몇 개의 선분이 겹치는지 카운트

            // 각 선분에 대해 현재 구간과 겹치는지 확인
            for (int[] line : lines) {
                if (line[0] <= start && line[1] >= end) {
                    count++;
                }
            }

            // 2개 이상의 선분이 겹치면, 해당 구간의 길이를 추가
            if (count >= 2) {
                overlapLength += end - start;
            }
        }

        return overlapLength;
    }
}