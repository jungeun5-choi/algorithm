import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numLog) {
        String str = "";
        for (int i = 1; i < numLog.length; i++) {
            if (compareTwo(numLog, i) == 1) str += "w";
            else if (compareTwo(numLog, i) == -1) str += "s";
            else if (compareTwo(numLog, i) == 10) str += "d";
            else str += "a";
        }
        return str;
    }

    private int compareTwo(int[] arr, int index) {
        return arr[index] - arr[index - 1];
    }
}