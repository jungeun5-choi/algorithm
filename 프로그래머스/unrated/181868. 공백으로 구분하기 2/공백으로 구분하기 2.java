class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim(); // 앞 뒤 공백 제거
		String[] answer = my_string.split("\\s+"); // 공백 전체
		return answer;
    }
}