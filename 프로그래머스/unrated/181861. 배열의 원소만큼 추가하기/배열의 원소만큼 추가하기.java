import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
		for (int j : arr) {
			for (int m = 0; m < j; m++) {
				answer.add(j);
			}
		}
		return answer.stream()
			.mapToInt(Integer::intValue)
			.toArray();
    }
}