class Solution {
    public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			answer += divisorCounter(i) % 2 == 0 ? i : -i;
		}
		return answer;
	}
    
    private int divisorCounter(int n) {
		int count = 0;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				count++;
			} else if (n % i == 0) {
				count += 2;
			}
		}
		return count;
	}
}