import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = Integer.parseInt(br.readLine());
			Set<String> set = new HashSet<>();
			
			for (int i = 0; i < count; i++) {
				
				String line = br.readLine();
				String name = line.split(" ")[0];
				String action = line.split(" ")[1];

				if ("enter".equals(action)) {
					set.add(name);
				} else {
					set.remove(name);
				}
			}
			
			Object[] arr = set.stream().sorted(Comparator.reverseOrder()).toArray();
			for(Object item : arr) {
				System.out.println(item);
			}
			
		} catch (Exception e) {

		}

	}
}