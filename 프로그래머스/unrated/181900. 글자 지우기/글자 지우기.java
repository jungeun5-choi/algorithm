class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
		boolean[] remove = new boolean[my_string.length()];
		for (int i = 0; i < indices.length; i++) {
			remove[indices[i]] = true;
		}
		for (int i = 0; i < my_string.length(); i++) {
			answer += remove[i] ? "" : my_string.charAt(i);
		}
		return answer;
    }
}