class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = compare(arr, queries[i][0], queries[i][1], queries[i][2]);
        }
        return answer;
    }

    private int compare(int[] arr, int a, int b, int compare) {
        int temp = 1000001;
        for (int i = a; i <= b; i++) {
            temp = arr[i] > compare && temp > arr[i] ? arr[i] : temp;
        }
        if (temp > 1000000) temp = -1;
        return temp;
    }
}