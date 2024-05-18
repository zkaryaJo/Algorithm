import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
				count--;
				continue;
			}
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					count--;
					break;
				}
			}
		}
		System.out.print(count);
	}
}