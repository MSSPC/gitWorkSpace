package book;

import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		if(t.equals(""))
		{System.out.println("Yes");}
		
		int i;
		int j;
		int w = 0;
		int count = 1;
		for (i = 0; i <= s.length()-1; i++) {
			for (j = w; j < t.length()-1; j++) {
				if (s.charAt(i) == t.charAt(j)) {
					w++;
					count++;
					break;
				}
			}
		}
		if (count == t.length()) {
			System.out.println("Yes");
		} else
			System.out.println("No");
	}

}
