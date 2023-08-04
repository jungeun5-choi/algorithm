class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb_odd = new StringBuilder(); // 홀수
        StringBuilder sb_even = new StringBuilder(); // 짝수

        for (int j : num_list) {
            sb_odd.append(!isEven(j) ? j : "");
            sb_even.append(isEven(j) ? j : "");
        }
        int odd = Integer.parseInt(sb_odd.toString());
        int even = Integer.parseInt(sb_even.toString());

        return odd + even;
    }

    private Boolean isEven(int num) {
        if (num % 2 == 0) return true;
        else return false;
    }
}