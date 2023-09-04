import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
		// K : rank, V : rankIndex
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> intList = new ArrayList<>();
		for (int i = 0; i < rank.length; i++) {
			map.put(rank[i], i);
		}
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) intList.add(rank[i]);
		}
		
		Collections.sort(intList);
		int a = map.getOrDefault(intList.get(0), 0);
		int b = map.getOrDefault(intList.get(1), 0);
		int c = map.getOrDefault(intList.get(2), 0);

		int answer = a * 10000 + b * 100 + c;
		return answer;
	}
}