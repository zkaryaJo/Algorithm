import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		double[] arr = new double[count];
		double max = 0;
		double sum = 0;

		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 100 / max;
			sum += arr[i];
		}

		System.out.println(sum/count);
		
		scanner.close();
	}
}