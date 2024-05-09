import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in) ;
		String input=scan.nextLine();
		int count=0; 

		for(int i=0;i<input.length();i++) {

			if(i+3<=input.length()) {
				String next=input.substring(i, i+3);
				if(next.equals("dz=")) {
					count++;
					i+=2;
				}
				else {
					String next_first=next.substring(0, 2);
					String next_second=next.substring(1,3);

					switch(next_first) {//앞 두자가 크로아티아 알파벳이면
					case "c=":	i++;	break;
					case "c-":	i++;	break;
					case "d-":	i++;	break;
					case "lj":	i++;	break;
					case "nj":	i++;	break;
					case "s=":	i++;	break;
					case "z=":	i++;	break;
					}

					switch(next_second) {
					case "c=":	count++;	i+=2;	break;
					case "c-":	count++;	i+=2;	break;
					case "d-":	count++;	i+=2;	break;
					case "lj":	count++;	i+=2;	break;
					case "nj":	count++;	i+=2;	break;
					case "s=":	count++;	i+=2;	break;
					case "z=":	count++;	i+=2;	break;
					}
					count++;
				}
			}
			else {
			String	next=input.substring(i, input.length());
			switch(next) {
			case "c=":	i++;	break;
			case "c-":	i++;	break;
			case "d-":	i++;	break;
			case "lj":	i++;	break;
			case "nj":	i++;	break;
			case "s=":	i++;	break;
			case "z=":	i++;	break;
			}	
			count++;
			}
		}
		System.out.println(count);
	}

}
