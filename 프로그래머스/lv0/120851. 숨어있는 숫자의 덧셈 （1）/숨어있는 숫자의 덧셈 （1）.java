class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-z, A-Z]", "");
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(my_string.substring(i, i + 1));
        }
        return answer;
    }
}