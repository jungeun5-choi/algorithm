import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
		int[] interval1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
		int[] interval2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

		for (int j : interval1) {
			answer.add(j);
		}
		for (int j : interval2) {
			answer.add(j);
		}

		return answer.stream()
			.mapToInt(Integer::intValue)
			.toArray();
    }
}