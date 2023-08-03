class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);

        int num1 = a * b * 2;
        int num2 = Integer.parseInt(sb.toString());

        return Math.max(num1, num2);
    }
}