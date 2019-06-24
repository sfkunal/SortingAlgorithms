
public class QuickSort {
	void quicksort(int[] a) {
		quick(a, 0, a.length-1);
	}

	void quick(int[] a, int left, int right) {
		if (right > left) {
			int pivotPos = partition(a, left, right);
			quick(a, left, pivotPos-1);
			quick(a, pivotPos+1, right);
		}
	}

	int partition(int[] a, int left, int right) {
		int splitPos = left;
		for (int i = left; i < right; i++) {
			if (a[i] < a[right]) {
				swap(a, i, splitPos);
				splitPos++;
			}
		}
		swap(a,splitPos,right);
		return splitPos;
	}

	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
