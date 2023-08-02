class Solution {
    public int solution(int[] array) {
        int answer = 0, fcnt = 0;
        int[] frequent = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
            frequent[array[i]]++; // 빈도 ++;
            
            if (fcnt < frequent[array[i]]) { // 최빈값
                fcnt = frequent[array[i]]; 
                answer = array[i];
            }
        }
        
        int temp = 0; // 여러 개인지 판별
        for (int m = 0; m < frequent.length; m++) {
            if (fcnt == frequent[m]) temp++;
            if (temp > 1) answer = -1;
        }
        
        return answer;    
    }
}