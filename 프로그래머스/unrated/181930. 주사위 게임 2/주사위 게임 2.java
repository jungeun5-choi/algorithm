import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && a != c && b != c) answer = a + b + c;
        else if (a == b && b == c) {
            answer = (a + b + c) * (pow(a, 2) + pow(b, 2) + pow(c, 2)) * (pow(a, 3) + pow(b, 3) + pow(c, 3));
        } else {
            answer = (a + b + c) * (pow(a, 2) + pow(b, 2) + pow(c, 2));
        }
        return answer;
    }
    
    private int pow(int num, int degree) {
        return (int) (Math.pow(num, degree));
    }
}

