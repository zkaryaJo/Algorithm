import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int monsterCount = scan.nextInt();
		int problemCount = scan.nextInt();

		Map<String, Object> nameMap = new HashMap<>();
		Map<String, Object> indexMap = new HashMap<>();
		for (int i = 1; i <= monsterCount; i++) {
			String input = scan.next();

			indexMap.put(input, i);
			nameMap.put("" + i, input);
		}

		for (int i = 0; i < problemCount; i++) {

			String input = scan.next();
			
			if (Character.isDigit(input.charAt(0))) {
				System.out.println("" + nameMap.get(input));
			} else {
				System.out.println("" + indexMap.get(input));
			}

		}

	}
}