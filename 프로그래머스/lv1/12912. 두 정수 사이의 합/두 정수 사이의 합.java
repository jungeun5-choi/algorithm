class Solution {
    public long solution(int a, int b) {
		long answer = 0;
		int front = 0, back = 0;
		if (a > b) {
			front = b; back = a;
		} else {
			front = a; back = b;
		}
		for (long i = front; i <= back; i++) {
			answer += i;
		}
		return answer;
	}
}