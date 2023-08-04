class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] arr = new int[included.length];
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (d * i);
            answer += included[i] ? arr[i] : 0;
        }

        return answer;
    }
}