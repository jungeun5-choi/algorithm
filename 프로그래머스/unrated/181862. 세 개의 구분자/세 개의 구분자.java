import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[a-c]+"))
			.filter(str -> !str.isEmpty())
			.toArray(String[]::new);
		if(answer.length == 0) answer = new String[]{"EMPTY"};
		return answer;
    }
}