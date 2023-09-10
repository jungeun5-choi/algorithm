class Solution {
    public long solution(int a, int b) {
		long answer = 0;
		for (long i = Math.min(a, b); i <= Math.max(b, a); i++) {
			answer += i;
		}
		return answer;
	}
}