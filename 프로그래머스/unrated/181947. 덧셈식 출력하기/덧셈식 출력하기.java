import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        sb.append(a).append(' ').append('+').append(' '); // 'a + '
        int b = Integer.parseInt(st.nextToken());
        sb.append(b).append(' ').append('=').append(' '); // 'b = '
        sb.append(a + b); // 'a+b'

        System.out.println(sb);
    }
}