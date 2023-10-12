import java.util.*;

class Solution {
    public int[] solution(int n) {
		List<Integer> answer = new ArrayList<>();
		factorization(n, answer);
		return answer.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
	}

	private void factorization(int n, List<Integer> list) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				list.add(i);
				n /= i;
			}
		}

		if (n != 1) {
			list.add(n);
		}
	}
}