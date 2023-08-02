class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        my_string = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length(), my_string.length());
        return my_string;
    }
}