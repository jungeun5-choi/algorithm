class Solution {
    public long solution(long n) {
		double sqrt = Math.sqrt(n);
		if (sqrt % 1 == 0) {
			double temp = sqrt + 1;
			return (long)Math.pow(temp, 2);
		} else return -1;
	}
}