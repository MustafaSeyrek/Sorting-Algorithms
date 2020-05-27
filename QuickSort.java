import java.util.Random;

public class QuickSort {

	// pivot = FirstElement
	public void FirstElement(int[] arr) {
		FirstElement(arr, 0, arr.length - 1);
	}

	private void FirstElement(int[] arr, int left, int right) {
		if (left < right) {
			int index = partitionFirst(arr, left, right);
			FirstElement(arr, left, index - 1);
			FirstElement(arr, index + 1, right);
		}
	}

	public static int partitionFirst(int[] arr, int left, int right) {
		int pivot = arr[left];
		int i = right + 1;
		for (int j = right; j > left; j--) {
			if (arr[j] >= pivot) {
				i--;
				swap(arr, i, j);
			}
		}
		swap(arr, i - 1, left);
		return i - 1;
	}

	// pivot random element
	public void RandomElement(int[] arr) {
		RandomElement(arr, 0, arr.length - 1);
	}

	private void RandomElement(int[] arr, int left, int right) {
		if (left < right) {
			int index = partitionRandom(arr, left, right);
			RandomElement(arr, left, index - 1);
			RandomElement(arr, index + 1, right);
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partitionRandom(int[] arr, int left, int right) {
		int pivot = left + ((int) Math.random() * (arr.length)) / (right - left + 1);
		int last = right;
		swap(arr, pivot, right);
		right--;
		while (left <= right) {
			if (arr[left] < arr[last])
				left++;
			else {
				swap(arr, left, right);
				right--;
			}
		}
		swap(arr, left, last);
		return left;

	}

	// pivot = MidOfFirstMidLastElement
	public void MidOfFirstMidLastElement(int[] arr) {
		MidOfFirstMidLastElement(arr, 0, arr.length - 1);
	}

	private void MidOfFirstMidLastElement(int[] arr, int left, int right) {
		if (left < right) {
			int index = partition(arr, left, right);
			MidOfFirstMidLastElement(arr, left, index - 1);
			MidOfFirstMidLastElement(arr, index + 1, right);
		}
	}

	public static int partition(int[] arr, int left, int right) {
		int middle = arr[(left + right) / 2];
		int l = arr[left];
		int r = arr[right];

		if (middle >= l && middle <= r)
			swap(arr, (left + right) / 2, right);
		else if (l >= middle && l <= r)
			swap(arr, left, right);

		int pivot = arr[right];
		int i = left;
		for (int j = left; j < right; j++) {

			if (arr[j] < pivot) {
				swap(arr, j, i);
				i++;
			}
		}
		arr[right] = arr[i];
		arr[i] = pivot;
		return i;
	}

}
