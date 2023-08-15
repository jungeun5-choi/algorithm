class Solution {
    public String solution(String my_string) {
        my_string = my_string.replaceAll("[aiueo]", "");
        return my_string;
    }
}