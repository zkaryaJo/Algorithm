import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		String[] arr = new String[count];

		// 1. 문자열 받기
		for (int i = 0; i < count; i++) {
			arr[i] = scanner.next();
		}

		// 2. 1줄씩 숫자계산.
		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			int prev = 0;

			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'X') {
					prev = 0;
				} else {
					sum = sum + 1 + prev;
					prev++;
				}
			}
			System.out.println(sum);

		}

		scanner.close();
	}
}