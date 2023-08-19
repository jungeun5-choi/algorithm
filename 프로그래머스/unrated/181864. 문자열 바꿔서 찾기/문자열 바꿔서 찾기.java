class Solution {
    public int solution(String myString, String pat) {
        String str1 = myString.replace("A", "X").replace("B", "A").replace("X", "B");		
		if(str1.contains(pat)) return 1;
		return 0;
    }
}