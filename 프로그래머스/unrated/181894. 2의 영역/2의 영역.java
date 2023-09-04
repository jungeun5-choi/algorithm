import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrcpy = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int first = arrcpy.indexOf(2);
		int last = arrcpy.lastIndexOf(2);

		if (first == -1)
			return new int[] {-1};
		else {
			int[] answer = new int[last - first + 1];
			int cnt = 0;
			for (int i = first; i <= last; i++) {
				answer[cnt++] = arr[i];
			}
			return answer;
		}
    }
}