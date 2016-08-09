package project_1;

import java.util.Scanner;

public class PAT_1003 {

	public static void checkString(String testString) {
		int position_b;
		int count_P;
		int count_T;
		for (int i = 0; i < testString.length(); i++) {
			if (testString.charAt(i) != 'A' && testString.charAt(i) != 'P'
					&& testString.charAt(i) != 'T') {
				System.out.println("NO");
			}
			else if(testString.charAt(i) == 'P'){
				position_b = i+1;
			}
		}
		
		for (int i =0; i <testString.length(); i++){
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = null;
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			checkString(str);
		}
	}
}
