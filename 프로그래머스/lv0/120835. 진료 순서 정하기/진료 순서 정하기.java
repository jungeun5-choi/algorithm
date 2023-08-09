import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] emergency) {
        List<Integer> answer = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        answer.sort(Comparator.reverseOrder()); // 내림차순 정렬
        for (int i = 0; i < emergency.length; i++) {
            emergency[i] = answer.indexOf(emergency[i]) + 1;
        }
        return emergency;
    }
}