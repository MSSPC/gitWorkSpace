package book;

public class QuickSort {

	private static int partition(int arr[], int first, int last) {
		int low = first + 1;
		int key = first;
		int high = last;

		while (low < high) {
			// search for the value which is bigger than key
			while (low < high && arr[low] <= key) {
				low++;
			}
			// search for the value which is smaller than key
			while (low < high && arr[high] > key) {
				high--;
			}
			// switch the small value with the big value
			if (low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		
		// Switch the pivot with the middle one
		while (first < high && arr[high] >= key) {
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

	public static void quickSort(int arr[], int first, int last) {
		if (last > first) {
			int key = partition(arr, first, last);
			quickSort(arr, first, key - 1);
			quickSort(arr, key + 1, last);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
