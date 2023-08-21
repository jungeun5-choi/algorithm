class Solution {
    public int solution(int[] array) {
        int answer = 0;
		for (int i = 0; i < array.length; i++) {
			String str = String.valueOf(array[i]);
			for (int m = 0; m < str.length(); m++) {
				if ("7".equals(str.substring(m, m + 1)))
					answer++;
			}
		}
		return answer;
    }
}