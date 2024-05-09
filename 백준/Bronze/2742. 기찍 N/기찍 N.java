import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for(int i=count;i>0;i--) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}