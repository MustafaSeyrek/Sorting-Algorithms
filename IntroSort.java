
public class IntroSort {

	static HeapSort heapsort = new HeapSort();
	static QuickSort quick = new QuickSort();

	public static void sort(int[] arr) {
		int depth = ((int) Math.log(arr.length)) * 2;
		sort(arr, depth, 0, arr.length - 1);

	}

	private static void sort(int[] arr, int depth, int left, int right) {
		int length = arr.length;
		if (length <= 1) {
			return;
		} else if (depth == 0) {

			heapSort(arr, left, right);
		} else {
			if (left >= right)
				return;

			int pivot = arr[(left + right) / 2];
			int index = partition(arr, left, right, pivot);
			sort(arr, depth - 1, left, index - 1);
			sort(arr, depth - 1, index, right);
		}
	}

	private static void heapSort(int[] arr, int left, int right) {
		for (int i = right / 2 - 1; i >= left; i--)
			heapsort.heapify(arr, right, i);
		for (int i = right - 1; i >= left; i--) {
			quick.swap(arr, left, i);
			heapsort.heapify(arr, i, left);
		}
	}

	private static int partition(int[] arr, int left, int right, int pivot) {
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
}
