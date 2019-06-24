
public class HeapSort {
	public static void heapsort(int[]a) {
		buildHeap(a);
		sortHeap(a);
	}
	private static void buildHeap(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			trickle(a, i, a.length);
		}
	}
	private static void sortHeap(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			swap(a, 0, i);
			trickle(a, 0, i);
		}
	}
	private static void trickle(int[] a, int i, int lastPosition) {
		int max = 0, maxPos = 0;
		if (hasChildren(i, lastPosition)) {
			if (hasOnlyLeftChild(i, lastPosition)) { 
				max = a[left(i)];
				maxPos = left(i);
			} else {
				maxPos = (a[left(i)] > a[right(i)]) ? left(i) : right(i);
				max = a[maxPos];
			}
			if (max > a[i]) {
				swap(a, i, maxPos);
				trickle(a, maxPos, lastPosition);
			}
		}
	}

	private static int left(int x) { return 2*x + 1; }
	private static int right(int x) { return 2*x + 2; }

	private static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	private static boolean hasChildren(int index, int length) {
		return (index+1 <= (length >> 1));
	}

	private static boolean hasOnlyLeftChild(int index, int length) {
		return ((index*2)+2 == length);
	}

	void printArray(int[] a) {
		System.out.print("{ " + a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.print(", " + a[i]);
		}
		System.out.println(" }");
	}
}
