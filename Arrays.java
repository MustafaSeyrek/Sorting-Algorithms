import java.util.Random;

public class Arrays {
	Random rnd = new Random();

	public int[] equalBin() {
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	public int[] equalOnbin() {
		int arr[] = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	public int[] equalYuzbin() {
		int arr[] = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	// **********************************************************//
	public int[] ramdomBin() {
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			int random = rnd.nextInt(1000);
			arr[i] = random;
		}
		return arr;
	}

	public int[] randomOnbin() {
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			int random = rnd.nextInt(10000);
			arr[i] = random;
		}
		return arr;
	}

	public int[] randomYuzbin() {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			int random = rnd.nextInt(100000);
			arr[i] = random;
		}
		return arr;
	}

	// *************************************************************//
	public int[] increasBin() {
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public int[] increasOnbin() {
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public int[] increasYuzbin() {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	// *************************************************************//

	public int[] decreasBin() {
		int[] arr = new int[1000];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[index] = i;
			index++;
		}
		return arr;
	}

	public int[] decreasOnbin() {
		int[] arr = new int[10000];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[index] = i;
			index++;
		}
		return arr;
	}

	public int[] decreasYuzbin() {
		int[] arr = new int[100000];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[index] = i;
			index++;
		}
		return arr;
	}

}
