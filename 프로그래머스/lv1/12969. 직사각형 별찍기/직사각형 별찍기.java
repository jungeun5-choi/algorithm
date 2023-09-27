import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int m = 0; m < a; m++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}