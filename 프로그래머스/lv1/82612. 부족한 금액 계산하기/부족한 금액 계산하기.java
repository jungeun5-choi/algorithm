class Solution {
    public long solution(int price, int money, int count) {
		long answer = 0;
		long current = 0;
		for (int i = 1; i <= count; i++) {
			current += (long)price * i;
		}

		if (current > money) {
			answer = current - money;
		}
		return answer;
	}
}