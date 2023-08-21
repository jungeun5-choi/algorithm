class Solution {
    public long solution(String numbers) {
        String[] counts = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < 10; i++) {
			numbers = numbers.replace(counts[i], String.valueOf(i));
		}
		return Long.parseLong(numbers);
    }
}