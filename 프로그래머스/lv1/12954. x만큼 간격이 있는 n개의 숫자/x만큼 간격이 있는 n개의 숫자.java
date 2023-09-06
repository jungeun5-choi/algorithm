class Solution {
    public long[] solution(int x, int n) {
		long[] answer = new long[n];
		int cnt = 0;
        long temp = x;
		while (cnt < n) {			 
			answer[cnt++] = temp;
			temp += x;
		}
		return answer;
	}
}