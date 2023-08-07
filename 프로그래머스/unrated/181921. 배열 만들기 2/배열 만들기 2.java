import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = i + "";
            int count = 0;
            for (int m = 0; m < str.length(); m++) {
                if (str.charAt(m) == '0' || str.charAt(m) == '5') {
                    count++;
                }
            }
            if (count == str.length()) {
                list.add(i);
            }
        }
        
        int[] answer = list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}