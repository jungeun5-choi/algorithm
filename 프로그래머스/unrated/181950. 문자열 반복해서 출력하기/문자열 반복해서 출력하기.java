import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            bw.write(str);
        }

        bw.close();
        br.close();
    }
}