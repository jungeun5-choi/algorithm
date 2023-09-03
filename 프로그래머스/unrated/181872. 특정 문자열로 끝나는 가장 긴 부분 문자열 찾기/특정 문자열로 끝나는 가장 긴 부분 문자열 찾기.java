class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
		int index = myString.lastIndexOf(pat); // 마지막 인덱스를 찾고
		answer = myString.substring(0, index) + pat; // substring으로 문자열
		return answer;
    }
}