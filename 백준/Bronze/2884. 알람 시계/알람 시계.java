import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute>=45) {
			
			minute = minute-45;
			
			System.out.println(""+hour+" "+(minute));
		}else {
			
			//minute = 60 + (minute-45)
			minute = 60 + (minute-45);
			
			//hour-1
			if(hour==0) {
				hour=23;
			}else {
				hour-=1;
			}
			System.out.println(""+hour+" "+(minute));
			
		}
		
		scanner.close();
	}
}