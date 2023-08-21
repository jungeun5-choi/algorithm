class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
		for (int m = i; m <= j; m++) {
			String str_ij = String.valueOf(m);
			for (int n = 0; n < str_ij.length(); n++) {
				if(String.valueOf(k).equals(str_ij.substring(n, n+1)))
					answer++;
			}
		}
		return answer;
    }
}