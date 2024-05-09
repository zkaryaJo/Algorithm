import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}

			if (arr[i] <= min) {
				min = arr[i];
			}
		}

		System.out.println(min + " " + max);

		scanner.close();
	}
}