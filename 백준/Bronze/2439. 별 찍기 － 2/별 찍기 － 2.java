import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {
			
			for(int k=0; k<count-i-1; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}