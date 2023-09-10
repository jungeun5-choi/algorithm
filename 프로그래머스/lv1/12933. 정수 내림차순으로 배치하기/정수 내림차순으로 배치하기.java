import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
		String n_temp = "" + n;
		String[] n_split = n_temp.split("", 0);
		Arrays.sort(n_split, Comparator.reverseOrder());
		return Long.parseLong(Arrays.stream(n_split).collect(Collectors.joining()));
	}
}