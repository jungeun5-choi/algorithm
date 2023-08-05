class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] chars = control.toCharArray();
        for (int i : chars) {
            if ('w' == i) answer += 1;
            else if ('s' == i) answer -= 1;
            else if ('d' == i) answer += 10;
            else answer -= 10;
        }
        return answer;
    }
}