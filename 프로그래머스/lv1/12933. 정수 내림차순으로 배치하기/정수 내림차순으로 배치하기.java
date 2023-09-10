import java.util.*;

class Solution {
    public long solution(long n) {
		String[] n_split = String.valueOf(n).split("", 0);
		Arrays.sort(n_split, Comparator.reverseOrder());

		StringBuilder sb = new StringBuilder();
		for (String s : n_split) {
			sb.append(s);
		}
		return Long.parseLong(sb.toString());
	}
}