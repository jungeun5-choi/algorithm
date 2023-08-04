class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = isZero(mode) ? 1 : 0;
            } else {
                ret.append(isZero(mode) ? isEven(i) ? code.charAt(i) : "" : !isEven(i) ? code.charAt(i) : "");
            }
        }

        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
    
    private Boolean isZero(int mode) {
        return mode == 0;
    }

    private Boolean isEven(int num) {
        return num % 2 == 0;
    }
}