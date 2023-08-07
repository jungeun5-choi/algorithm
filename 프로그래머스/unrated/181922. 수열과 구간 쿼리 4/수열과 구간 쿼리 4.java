class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int m = queries[i][0]; m <= queries[i][1]; m++) {
                if (m % queries[i][2] == 0) {
                    arr[m]++;
                }
            }
        }
        return arr;
    }
}