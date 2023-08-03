import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> array_list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            array_list.add(num_list[i]);
        }
        Collections.reverse(array_list);
        return array_list
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}