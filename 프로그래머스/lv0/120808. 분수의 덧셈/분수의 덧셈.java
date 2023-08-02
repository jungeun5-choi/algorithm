import java.util.Arrays;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int bottom1 = numer1, top1 = denom1, bottom2 = numer2, top2 = denom2;
        if (top1 != top2) {
            // denom
            top1 = lcm(new int[]{denom1, denom2});
            top2 = top1;

            // numer
            bottom1 = numer1 * (top1 / denom1);
            bottom2 = numer2 * (top2 / denom2);
        }

        int denom = top1;
        int numer = bottom1 + bottom2;

        int div = gcd(new int[]{denom, numer});
        denom /= div;
        numer /= div;

        int[] answer = {numer, denom};
        return answer;  
    }
    
    private int gcd(int[] arr) {
        Arrays.sort(arr);
        while (arr[1] % arr[0] != 0) {
            int temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp % arr[0];
        }
        return arr[0];
    }

    public int lcm(int[] arr) {
        Arrays.sort(arr);
        return (arr[1] * arr[0]) / gcd(arr);
    }
}