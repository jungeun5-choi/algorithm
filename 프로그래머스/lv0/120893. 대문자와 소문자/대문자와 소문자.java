import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] < 91) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}