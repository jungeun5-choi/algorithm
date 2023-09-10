class Solution {
    public boolean solution(int x) {
		int num = 0;
		int temp = x;
		while (temp > 0) {
			num += temp % 10;
			temp /= 10;
		}
		return x % num == 0;
	}
}