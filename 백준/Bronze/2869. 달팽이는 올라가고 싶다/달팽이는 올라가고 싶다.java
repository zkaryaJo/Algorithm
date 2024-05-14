import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		} catch (Exception e) {

		}

		int up = Integer.parseInt(line.split(" ")[0]);
		int down = Integer.parseInt(line.split(" ")[1]);
		int top = Integer.parseInt(line.split(" ")[2]);
        
        int day = (top-down) / (up-down);
        
        if((top-down) % (up-down) != 0){
            System.out.println(++day);
        }else{
            System.out.println(day);
        }
	}
}