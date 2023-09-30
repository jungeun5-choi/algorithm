import java.util.*;

class Solution {
    public int solution(String t, String p) {
        List<Long> answer = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            temp = t.substring(i, i + p.length());
            if(Long.parseLong(p) >= Long.parseLong(temp)) {
                answer.add(Long.parseLong(temp));
            }
        }
        return answer.size();
    }
}