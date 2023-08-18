class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		StringBuilder answer = new StringBuilder();

		String[] alphabets = letter.split(" ");
		for(String alphabet : alphabets) {
			for(int m = 0; m < morse.length; m++) {
				if(morse[m].equals(alphabet)) {
					answer.append((char)(m + 97)); // ascii만큼 더해줌
				}
			}
		}
		return answer.toString();
    }
}