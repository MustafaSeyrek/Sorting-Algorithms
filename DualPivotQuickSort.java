
public class DualPivotQuickSort {
	static QuickSort quick = new QuickSort();

	public void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int left, int right) {

		if (right <= left)
			return;

		int pivot1 = arr[left];
		int pivot2 = arr[right];

		if (pivot1 > pivot2) {
			quick.swap(arr, left, right);
			pivot1 = arr[left];
			pivot2 = arr[right];

		} else if (pivot1 == pivot2) {
			while (pivot1 == pivot2 && left < right) {
				left++;
				pivot1 = arr[left];
			}
		}

		int i = left + 1;
		int lt = left + 1;
		int gt = right - 1;

		while (i <= gt) {

			if ((arr[i] < pivot1)) {
				quick.swap(arr, i++, lt++);
			} else if ((pivot2 < arr[i])) {
				quick.swap(arr, i, gt--);
			} else {
				i++;
			}

		}

		quick.swap(arr, left, --lt);
		quick.swap(arr, right, ++gt);

		sort(arr, left, lt - 1);
		sort(arr, lt + 1, gt - 1);
		sort(arr, gt + 1, right);

	}

}
