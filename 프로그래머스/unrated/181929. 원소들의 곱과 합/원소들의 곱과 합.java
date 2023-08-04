class Solution {
    public int solution(int[] num_list) {
        int num_multiple = 1; // 모든 원소들의 곱
        int num_pow = 0; // 모든 원소들의 합의 제곱
        for (int j : num_list) {
            num_multiple *= j;
            num_pow += j;
        }
        num_pow = pow(num_pow, 2);

        return num_multiple < num_pow ? 1 : 0;
    }
    
    private int pow(int num, int degree) {
        return (int) (Math.pow(num, degree));
    }
}