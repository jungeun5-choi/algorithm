import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int j : numlist) {
            if (j % n == 0) list.add(j);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}