class Solution {
    public String solution(int n) {
		String su = "수", bak = "박";
		StringBuilder answer = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			answer.append(i % 2 != 0 ? su : bak);
		}
		return answer.toString();
	}
}