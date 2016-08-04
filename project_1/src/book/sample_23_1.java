package book;

import java.util.Scanner;

public class sample_23_1 {

	public static long fib(long n) {
		long f0 = 0;
		long f1 = 1;
		long f2 = 2;

		if (n == 0)
			return f0;
		else if (n == 1)
			return f1;
		else if (n == 2)
			return f2;

		for (int i = 3; i <= n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		return f2;
	}

	public static int gdc(int m, int n) {
		int gdc = 1;
		if (m % n == 0)
			gdc = n;
		for (int k = n / 2; k >= 1; k--) {
			if (m % k == 0 && n % k == 0)
				gdc = k;
		}
		return gdc;
	}

	public static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}

	public static void quickSort(int arr[]) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int arr[], int first, int last) {
		if (first < last) {
			int pivot = partition(arr, first, last);
			quickSort(arr, first, pivot - 1);
			quickSort(arr, pivot + 1, last);
		}
	}

	private static int partition(int arr[], int first, int last) {
		int low = first + 1;
		int high = last;
		int key = arr[first];

		while (low < high) {
			while (low <= high && arr[low] <= key) {
				low++;
			}
			while (low <= high && arr[high] > key) {
				high--;
			}

			if (low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}

		while (high > first && arr[high] >= key) {
			high--;
		}

		if (key > arr[high]) {
			arr[first] = arr[high];
			arr[high] = key;
			return high;
		} else {
			return first;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int l[] = { 2, 5, 3, 6, 5, 3, 8, 16, 34, 22, 15 };
//		quickSort(l);
//		for (int i = 0; i < l.length; i++) {
//			System.out.println(l[i]);
//		}
		
		Scanner sc = new Scanner (System.in);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}