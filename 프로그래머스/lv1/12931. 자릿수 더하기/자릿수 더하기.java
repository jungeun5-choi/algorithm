import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
		String str = "" + n;
		String[] arr = str.split("");
		for(int i = 0; i < arr.length; i++) {
			answer += !arr[i].isBlank()? Integer.parseInt(arr[i]) : 0;
		}
		return answer;
    }
}