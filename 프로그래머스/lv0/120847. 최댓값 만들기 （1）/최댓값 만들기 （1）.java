import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        integerList.sort(Comparator.reverseOrder()); // 내림차순 정렬
        return integerList.get(0) * integerList.get(1);
    }
}