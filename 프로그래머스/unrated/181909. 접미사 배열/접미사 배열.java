import java.util.*;

class Solution {
    public String[] solution(String my_string) {
		List<String> answer = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			answer.add(my_string.substring(i));
		}
		answer.sort(Comparator.naturalOrder());
		return answer.toArray(String[]::new);
	}
}