class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		for (int s = 0; s < queries.length; s++) {
			for (int e = queries[s][0]; e <= queries[s][1]; e++) {
				arr[e] ++;
			}
		}
		return arr;
    }
}