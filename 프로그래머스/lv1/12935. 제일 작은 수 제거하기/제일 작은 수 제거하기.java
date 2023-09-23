import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
		if (arr.length <= 1) {
			return new int[] {-1};
		}
		int[] answer = new int[arr.length - 1];
		// 가장 작은 수 찾기
		int min = Integer.MAX_VALUE;
		for (int j : arr) {
			if (min > j) min = j;
		}
		// 가장 작은 수를 제외하고 값 복사
		int cnt = 0;
		for (int j : arr) {
			if (min != j) answer[cnt++] = j;
		}		
		return answer;
	}
}