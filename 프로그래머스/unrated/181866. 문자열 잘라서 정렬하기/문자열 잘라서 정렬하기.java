import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
		String[] str = myString.trim().split("x+");
		for(int i = 0; i < str.length; i++) {
			if(!str[i].equals("")) answer.add(str[i]);
		}
		answer.sort(Comparator.naturalOrder());
		return answer.toArray(String[]::new);
    }
}