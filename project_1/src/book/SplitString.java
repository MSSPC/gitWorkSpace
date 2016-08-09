package book;

import java.util.Scanner;

public class SplitString {
	static int i =0, m=0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (i = 1; i < a; i++) {
			if (isFb(i) > a) {
				if (isFb(i) - a > a - isFb(i - 1)) {
					System.out.println(a - isFb(i - 1));
					break;
				} else {
					System.out.println(isFb(i) - 1);
					break;
				}
			}

		}
	}

	public static int isFb(int n) {

		if (n == 1 || n == 2) {
			return 1;
		} else {
			return isFb(n - 1) + isFb(n - 2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        int n = in.nextInt();
//	        String gc = in.nextLine();
//	        String [] str = new String[n];
//	        for (int i =0; i<n; i++)
//	        {
//	        	str[i] = in.nextLine();
//	        }
//	        System.out.println(judge(str));
//	    }
//	    public static String judge(String[] str){
//	        String resultBoth = "both";
//	        String resultNone = "none";
//	        String resultA = "lexicographically";
//	        String resultB = "lengths";
//	        String result = null;;
//	        boolean a = sortAsLength(str);
//	        boolean b = sortAsDictionary(str);
//	        
//	        if (str==null){
//	        	result = resultNone;
//	        }
//	        else if (a&&b)
//	        {
//	        	result = resultBoth;
//	        }
//	        else if (a)
//	        {
//	        	result = resultB;
//	        }
//	        else if (b)
//	        {
//	        	result = resultA;
//	        }
//	        else{
//	        	result = resultNone;
//	        }
//	        return result;
//	    }
//	    public static boolean sortAsLength(String[] str){
//	    	for(int i =0; i<str.length-1; i++)
//	    	{
//	    		if(str[i].length()>str[i+1].length()){
//	    			return false;
//	    		}
//	    	}
//	        return true;
//	    }
//	    public static boolean sortAsDictionary(String[] str){
//	        for(int i =0; i<str.length-1; i++)
//	        {
//	        	if(!compare(str[i],str[i+1])){
//	        		return false;
//	        	}
//	        }
//	    	return true;
//	    }
//	    public static boolean compare(String s1, String s2){
//	    	boolean re = true;
//	    	for(int i=0; i<s1.length()&&i<s2.length(); i++){
//	    		if(s1.charAt(i)>s2.charAt(i)){
//	    			re = false;
//	    			break;
//	    		}
//	    		else if(s1.charAt(i)<s2.charAt(i)){
//	    			re = true;
//	    			break;
//	    		}
//	    		else{
//	    			if(s1.length()<s2.length())
//	    			{
//	    				re =true;
//	    			}
//	    			else{
//	    				re = false;
//	    			}
//	    		}
//	    	}
//	    	return re;
//	    }
//	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String t = sc.nextLine();
//		if(t.equals(""))
//		{System.out.println("Yes");}
//		
//		int i;
//		int j;
//		int w = 0;
//		int count = 1;
//		for (i = 0; i <= s.length()-1; i++) {
//			for (j = w; j < t.length()-1; j++) {
//				if (s.charAt(i) == t.charAt(j)) {
//					w++;
//					count++;
//					break;
//				}
//			}
//		}
//		if (count == t.length()) {
//			System.out.println("Yes");
//		} else
//			System.out.println("No");
//	}

}
