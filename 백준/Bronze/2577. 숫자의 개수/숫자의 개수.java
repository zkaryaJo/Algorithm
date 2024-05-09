import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = 0;
		}

		Scanner scanner = new Scanner(System.in);
		int count = 3;
		int input = 1;

		for (int i = 0; i < count; i++) {
			input = input * scanner.nextInt();
		}
		
		String strInput = ""+input;
		
		for(int i=0; i<strInput.length(); i++) {
			arr[Integer.parseInt(""+strInput.charAt(i))]++;
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}

		scanner.close();
	}
}