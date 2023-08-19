class Solution {
    public int solution(int order) {
        int answer = 0;
		String str = order + "";
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			if (num != 0 && num % 3 == 0) answer++;
		}
		return answer;
    }
}