class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int j : num_list) {
            answer = (j == n) ? 1 : 0;
            if(answer == 1) break;
        }
        return answer;
    }
}