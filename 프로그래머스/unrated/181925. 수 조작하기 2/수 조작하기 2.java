import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        List<Integer> logs = Arrays.stream(numLog).boxed().collect(Collectors.toList());
        
        for (int i = 1; i < logs.size(); i++) {
            if (compareTwo(logs, i) == 1) sb.append("w");
            else if (compareTwo(logs, i) == -1) sb.append("s");
            else if (compareTwo(logs, i) == 10) sb.append("d");
            else  sb.append("a");
        }
        return sb.toString();
    }

    private int compareTwo(List<Integer> arr, int index) {
        return arr.get(index) - arr.get(index - 1);
    }
}