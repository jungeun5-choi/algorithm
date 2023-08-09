class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return substring(numbers, num1, num2);
    }

    private int[] substring(int[] numbers, int num1, int num2) {
        int[] temp = new int[num2 - num1 + 1];
        int cnt = 0;
        for(int i = num1; i < num2 + 1; i++) {
            temp[cnt++] = numbers[i];
        }        
        return temp;
    }
}