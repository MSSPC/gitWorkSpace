package project_1;

import java.util.ArrayList;
import java.util.List;

public class lC_87 {
	public boolean isScramble(String s1, String s2) {

		List<String> ls_1 = new ArrayList<String>();
		List<String> ls_2 = new ArrayList<String>();
		for (int i = 1; i <= s1.length(); i++) {
			String sc = s1.substring(i - 1, i);
			ls_1.add(sc);
		}

		for (int j = 1; j <= s2.length(); j++) {
			String sc = s2.substring(j - 1, j);
			ls_2.add(sc);
		}

		if (ls_1.containsAll(ls_2) && !s1.equals(s2)) {
			return true;
		}
		return false;
	}

	public boolean isscramble(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		if(s1==s2)
		{
			return true;
		}
		
		int[] A = new int[26];
		for(int i =0; i<s1.length(); i++)
		{
			A[s1.charAt(i)-'a']++;
		}
		for(int i=0; i<s2.length(); i++)
		{
			A[s2.charAt(i)-'a']--;
		}
		
//		for(int i = 1; i<L; i++){
//			if (char[i] !=0)
//		}

		return true;
	}
}
