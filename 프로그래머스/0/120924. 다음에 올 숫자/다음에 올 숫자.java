class Solution {
    public int solution(int[] common) {
        int length = common.length;
        // 등차수열인지 확인
        if (common[1] - common[0] == common[2] - common[1]) {
            int difference = common[1] - common[0]; // 공차
            return common[length - 1] + difference;
        }
        // 등비수열인지 확인
        else if (common[1] / common[0] == common[2] / common[1]) {
            int ratio = common[1] / common[0]; // 공비
            return common[length - 1] * ratio;
        }
        return -1; // 이 조건이 실행될 일은 없으나, 모든 조건을 충족하지 않는 경우를 위해 추가
    }
}