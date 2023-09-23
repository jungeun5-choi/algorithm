class Solution {
    public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		int s_length = s.length();
		int s_center = s_length / 2;
		if (s_length % 2 != 0) {
			answer.append(s.charAt(s_center));
		} else {
			answer.append(s.charAt(s_center - 1)).append(s.charAt(s_center));
		}
		return answer.toString();
	}
}