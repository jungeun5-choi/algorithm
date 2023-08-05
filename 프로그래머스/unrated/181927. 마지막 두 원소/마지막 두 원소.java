import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        int last = answer.size() - 1;
        answer.add(compareLastTwo(answer, last) ? answer.get(last) - answer.get(last - 1) : answer.get(last) * 2);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private Boolean compareLastTwo(List<Integer> arr, int index) {
        return arr.get(index).compareTo(arr.get(index - 1)) > 0;
    }
}