class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = arr1.length > arr2.length ? 1 : -1;
		if (answer == -1 && arr1.length == arr2.length) {
			int temp1 = 0, temp2 = 0;
			for (int i = 0; i < arr1.length; i++) {
				temp1 += arr1[i];
				temp2 += arr2[i];
			}
			answer = temp1 >= temp2? temp1 > temp2? 1 : 0 : -1;
		}
		return answer;
    }
}