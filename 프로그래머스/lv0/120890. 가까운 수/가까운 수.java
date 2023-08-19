import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i >= 1 && array[i] >= n) {
                return n - array[(i - 1)] <= array[i] - n ? array[(i - 1)] : array[i];
            }
        }
        return array[array.length - 1];
    }
}