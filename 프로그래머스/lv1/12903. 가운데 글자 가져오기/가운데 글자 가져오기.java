class Solution {
    public String solution(String s) {
		String answer = "";
		int s_length = s.length();
		int s_center = s_length / 2;
		if (s_length % 2 != 0) {
			answer = s.charAt(s_center) + "";
		} else {
			answer = s.charAt(s_center - 1) + "";
			answer += s.charAt(s_center) + "";
		}
		return answer;
	}
}