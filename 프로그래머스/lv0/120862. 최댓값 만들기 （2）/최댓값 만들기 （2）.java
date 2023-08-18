import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
		int multiple1 = numbers[0] * numbers[1];
		int multiple2 = numbers[numbers.length - 2] * numbers[numbers.length - 1];
		return Math.max(multiple1, multiple2);
    }
}