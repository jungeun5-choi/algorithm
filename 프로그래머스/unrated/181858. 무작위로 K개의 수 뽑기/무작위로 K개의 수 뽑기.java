import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
		List<Integer> temp_arr = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()); // 중복 제거
		int[] answer = new int[k];
		Arrays.fill(answer, -1);
		
		int cnt = Math.min(answer.length, temp_arr.size());; 
		for(int i = 0; i < cnt; i++) {
			answer[i] = temp_arr.get(i);			
		}
		return answer;
	}
}