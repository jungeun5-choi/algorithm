import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
		List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());
		for (int k : arr) {
			for (int j : delete_list) {
				if (k == j)
					answer.remove(Integer.valueOf(k));
			}
		}
		return answer.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}