import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
		String[] arr = s.split("");
		Arrays.sort(arr);

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt = 0;
			for (int m = 0; m < arr.length; m++) {
				if (arr[i].equals(arr[m]))
					cnt++;
			}
			if (cnt == 1) answer += arr[i];
		}
		return answer;
    }
}