class Solution {
    public int solution(int number, int n, int m) {
        return number % lcm(n, m) == 0 ? 1 : 0;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}