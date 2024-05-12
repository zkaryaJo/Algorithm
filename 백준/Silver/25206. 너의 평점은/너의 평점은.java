import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double sum = 0;
			int count = 0;
			for(int i=0; i<20; i++) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				double credit = Double.parseDouble(line.split(" ")[1]);
				String grade = line.split(" ")[2];

				count+= (int)credit;
				switch (grade) {
					case "A+": sum += credit * 4.5; break;
					case "A0": sum += credit * 4; break;
					case "B+": sum += credit * 3.5; break;
					case "B0": sum += credit * 3; break;
					case "C+": sum += credit * 2.5; break;
					case "C0": sum += credit * 2; break;
					case "D+": sum += credit * 1.5; break;
					case "D0": sum += credit * 1; break;
					case "P": count -= (int)credit; break;
				}
			}
			System.out.println(sum / count);

		} catch (Exception e) {
			System.out.print("" + e);
		}

	}
}