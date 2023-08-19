class Solution {
    public int solution(int[] num_list) {
        int odd = 0; // 홀
		int even = 0; // 짝
		for (int i = 0; i < num_list.length; i++) {
			odd += i % 2 == 1 ? num_list[i] : 0;
			even += i % 2 == 0 ? num_list[i] : 0;
		}
		return Math.max(odd, even);
    }
}