import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());
        for(int i = 0; i < num; i++) {
            for(int m = 0; m <= i; m++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}