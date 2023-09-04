class Solution {
    public int[][] solution(int[][] arr) {
		int xlen = arr.length, ylen = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > ylen)
				ylen = arr[i].length;
		}
		int len = Math.max(xlen, ylen);
		int[][] answer = new int[len][len];
		for (int i = 0; i < arr.length; i++) {
			for (int m = 0; m < arr[i].length; m++) {
				answer[i][m] = arr[i][m];
			}
		}
		return answer;
	}
}