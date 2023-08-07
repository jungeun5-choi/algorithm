class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int count = 0;
        for (int m = start; m <= end; m++) {
            answer[count++] = m;
        }
        return answer;
    }
}