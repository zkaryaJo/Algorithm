import java.util.*;

public class Main {
	public static int find(char[][] arr, int row, int col) {

		int count1 = 0; // 첫번째 문자와 동일할때
		int count2 = 0; //

		char c = 'B';
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				if ((i+row) % 2 == 0) {
					if ((j+col) % 2 == 0) {
						if (c == arr[i+row][j+col]) {
							count2++;
						} else {
							count1++;
						}
					} else {
						if (c == arr[i+row][j+col]) {
							count1++;
						} else {
							count2++;
						}
					}
				} else {
					if ((j+col) % 2 == 0) {
						if (c == arr[i+row][j+col]) {
							count1++;
						} else {
							count2++;
						}
					} else {
						if (c == arr[i+row][j+col]) {
							count2++;
						} else {
							count1++;
						}
					}
				}
			}
		}
		
		//System.out.println(row+","+col+", count1"+count1+", count2:"+count2);
		
		return count1 > count2 ? count2 : count1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		int row = Integer.parseInt(line.split(" ")[0]);
		int col = Integer.parseInt(line.split(" ")[1]);

		char[][] arr = new char[row][col];
		for (int i = 0; i < row; i++) {
			arr[i] = scan.nextLine().toCharArray();
		}
		
		int min = 999999999;
		
		for(int i=0; i<=row-8; i++) {
			for(int j=0; j<=col-8; j++) {
				int cost = find(arr, i, j);
				if(min>cost) {
					min = cost;
					//System.out.println(i+","+j);
				}
			}
		}

		System.out.println(min);

	}
}