import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> dice = new HashMap<>();
        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);
                
        List<Integer> keys = new ArrayList<>(dice.keySet());
        
        switch (dice.size()) {
            case 1: // 모두 같은 수
                return 1111 * a;
            case 2: // 두 가지 수
                if (dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) {
                    // 1 : 3
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int) Math.pow((10 * p) + q, 2);
                } else {
                    // 2 : 2
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
            case 3: // 2개 같고, 1, 1 다름
                int result = 0;
                for (Integer key : dice.keySet()) {
                    if (dice.get(key) != 2) {
                        if (result == 0) {
                            result = key;
                        } else {
                            return result * key;
                        }
                    }
                }
            case 4: // 제일 작은 수
                Collections.sort(keys);
                return keys.get(0);
        }
        return 0;
    }
}