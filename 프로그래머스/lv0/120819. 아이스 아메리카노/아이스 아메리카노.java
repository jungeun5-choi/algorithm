class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int ice = 5500;
        if (money < 5500) answer = new int[]{0, money};
        else {
            answer = new int[]{money / ice, money % ice};
        }
        return answer;
    }
}