class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int j : array) {
            answer += j == n ? 1 : 0;
        }
        return answer;
    }
}