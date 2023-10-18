import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		int[] counts = new int[10];
		int multiply = 1;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			multiply *= numbers[i];
		}
		String str = multiply + "";
		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i) - 47;
			counts[temp - 1]++;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.print(counts[i] + "\n");
		}

		return;
	}
}