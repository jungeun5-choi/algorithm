class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] s_split = s.split("", 0);
        int idx = 0;

        for (int i = 0; i < s_split.length; i++) {
            if (s_split[i].equals(" ")) {
                idx = 1;
            }

            answer.append(idx % 2 == 0 ? s_split[i].toUpperCase() : s_split[i].toLowerCase());
            idx++;
        }
        return answer.toString();
    }
}