class Solution {
    public int solution(int n, int k) {
        int lamb = n * 12000;
        int drink = k * 2000;
        if (n / 10 > 0) {
            drink -= (n / 10) * 2000;
        }
        return lamb + drink;
    }
}