import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder t = new StringBuilder(sc.next());
		int[] arr = new int[26];
		for (int i = 0; i < t.length(); i++) {
			arr[(char)(t.charAt(i) - 97)]++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return;
	}
}