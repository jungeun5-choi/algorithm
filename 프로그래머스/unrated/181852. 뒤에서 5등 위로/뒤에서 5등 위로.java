import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> integerList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        integerList.sort(Comparator.naturalOrder()); // 오름차순 정렬
        ArrayList<Integer> newIntegerList =
                new ArrayList<>(integerList.subList(5, integerList.size()));

        return newIntegerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}