import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 9;

		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		int idx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				idx = i+1;
			}

			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(idx);
//		System.out.println(min + " " + max);

		scanner.close();
	}
}