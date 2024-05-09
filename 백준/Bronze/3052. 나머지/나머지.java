import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		Scanner scanner = new Scanner(System.in);
		int count = 10;
		int input = 0;

		int result = 0;

		for (int i = 0; i < count; i++) {
			input = scanner.nextInt();
			arr[input % 42]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result++;
			}
		}
		System.out.println(result);

		scanner.close();
	}
}