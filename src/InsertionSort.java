
public class InsertionSort {
	void insertionSort(int[] a) {
	    for (int i = 0; i < a.length; i++) {
	        insert(a, i);
	    }
	}

	void insert(int[] a, int i) {
	    int j;
	    for (j = 0; a[i] > a[j] && j < i; j++) {}
	    int temp = a[i];
	    for (int k = i; k > j; k--) {
	        a[k] = a[k-1];
	    }
	    a[j] = temp;
	}
}
