import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] chars = br.readLine().toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] < 91) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        bw.write(chars);

        bw.close();
        br.close();
    }
}