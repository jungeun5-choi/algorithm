import java.util.*;

class Solution {
    public String solution(String s) {
		String[] s_split = s.split("", 0);
		Arrays.sort(s_split, Collections.reverseOrder());
		StringBuilder answer = new StringBuilder();
		for (String value : s_split) {
			answer.append(value);
		}
		return answer.toString();
	}
}