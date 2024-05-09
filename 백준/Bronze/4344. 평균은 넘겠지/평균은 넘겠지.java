import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalCaseCount = scanner.nextInt();

		// 1. 문자열 받기
		for (int i = 0; i < totalCaseCount; i++) {

			// 1.1. 학생수
			double stundentCount = scanner.nextDouble();
			double sum = 0;
			double[] arr = new double[(int) stundentCount];

			// 1.2. 학생별 성적 입력받기, 합계 계산
			for (int j = 0; j < (int) stundentCount; j++) {
				arr[j] = scanner.nextDouble();
				sum += arr[j];
			}

			// 1.3. 평균 계산
			double average = sum / stundentCount;
			double upperAverageCount = 0;

			// 1.4. 평균보다 높은 친구 Count세기
			for (int j = 0; j < stundentCount; j++) {
				if (arr[j] > average) {
					upperAverageCount++;
				}
			}

			double result = upperAverageCount / stundentCount * 100;

			System.out.println(String.format("%.3f", result) + "%");

		}

		scanner.close();
	}
}