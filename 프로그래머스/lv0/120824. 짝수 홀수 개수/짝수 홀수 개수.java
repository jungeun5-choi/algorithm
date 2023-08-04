class Solution {
    public int[] solution(int[] num_list) {
        int even = 0, odd = 0; // 짝, 홀
        for(int i : num_list) {
            if(isEven(i)) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }
    
    private static Boolean isEven(int num) {
        return num % 2 == 0;
    }
}