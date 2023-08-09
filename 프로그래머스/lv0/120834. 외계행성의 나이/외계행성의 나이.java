class Solution {
    public String solution(int age) {
        String string_age = Integer.toString(age);
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < string_age.length(); i++) {
            answer.append((char)(string_age.charAt(i) + 49));
        }
        return answer.toString();
    }
}