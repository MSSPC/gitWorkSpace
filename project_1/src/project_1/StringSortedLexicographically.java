package project_1;

import java.util.Scanner;

public class StringSortedLexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input two strings:");
		String stringA = scanner.nextLine();
		String stringB = scanner.nextLine();

		System.out.println(isStringSortedLexicographically(stringA, stringB));
	}

	public static boolean isStringSortedLexicographically(String FirstString,
			String SecondString) {
		for (int i = 0; i < FirstString.length() && i < SecondString.length(); i++) {
			if (FirstString.length() > SecondString.length()
					|| FirstString.charAt(i) > SecondString.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static int QuickSort(int arr[], int first, int last){
		int low = first+1;
		int high = last;
		int key = first;
		int temp;
		while(low < high){
			while(low < high && arr[low]<=key){
				low++;
			}
			while(low < high && arr[high]>key){
				high--;
			}
			if(low < high){
				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		
		while(first < high && arr[high]>=key){
			high--;
		}
		if(key > arr[high]){
			arr[first] = arr[high];
			arr[high] = key;
			return high;
		}
		else{
			return first;
		}
	}

}
