import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
		int index = 1;
		while (index < arr.length) {
			index *= 2;
		}

		int[] zeroArr = new int[index - arr.length];
		Arrays.fill(zeroArr, 0);

		int[] answer = new int[index];

		// 기존 배열 복사
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}

		// 0으로 채워진 배열 복사
		for (int i = arr.length; i < arr.length + index - arr.length; i++) {
			answer[i] = zeroArr[i - arr.length];
		}

		return answer;
	}
}