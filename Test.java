import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		HeapSort heapsort = new HeapSort();
		QuickSort quicksort = new QuickSort();
		DualPivotQuickSort dualsort = new DualPivotQuickSort();
		IntroSort introsort = new IntroSort();
		Arrays arr = new Arrays();

		int[] equalBin = arr.equalBin();
		int[] equalOnbin = arr.equalOnbin();
		int[] equalYuzbin = arr.equalYuzbin();

		int[] ramdomBin = arr.ramdomBin();
		int[] randomOnbin = arr.randomOnbin();
		int[] randomYuzbin = arr.randomYuzbin();

		int[] increasBin = arr.increasBin();
		int[] increasOnbin = arr.increasOnbin();
		int[] increasYuzbin = arr.increasYuzbin();

		int[] decreasBin = arr.decreasBin();
		int[] decreasOnbin = arr.decreasOnbin();
		int[] decreasYuzbin = arr.decreasYuzbin();

		long startTime = System.currentTimeMillis();
		// heapsort.sort(decreasYuzbin);
		// quicksort.FirstElement(decreasYuzbin);
		// quicksort.RandomElement(decreasYuzbin);
		// quicksort.MidOfFirstMidLastElement(decreasYuzbin);
		// dualsort.sort(decreasYuzbin);
		// introsort.sort(decreasYuzbin);
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(estimatedTime);

	}
}
