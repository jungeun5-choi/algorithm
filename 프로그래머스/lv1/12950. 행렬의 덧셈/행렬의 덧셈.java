class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int m = 0; m < arr1[i].length; m++) {
                answer[i][m] = arr1[i][m] + arr2[i][m];
            }
        }
        return answer;
    }
}