class Solution {
    public int solution(int num, int k) {
        String str = num + "";
		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i) - '0';
			if(temp == k) return i + 1;
		}
		return -1;
    }
}