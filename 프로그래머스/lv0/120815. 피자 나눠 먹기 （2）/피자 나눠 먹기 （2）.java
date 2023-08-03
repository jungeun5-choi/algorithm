class Solution {
    public int solution(int n) {
        int answer = lcm(n, 6);
        return answer / 6;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}