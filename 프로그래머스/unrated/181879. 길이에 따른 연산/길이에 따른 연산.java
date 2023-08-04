class Solution {
    public int solution(int[] num_list) {
        if (num_list.length > 10) {
            int sum = 0;
            for (int j : num_list) {
                sum += j;
            }
            return sum;
        } else {
            int mul = 1;
            for (int j : num_list) {
                mul *= j;
            }
            return mul;
        }
    }
}