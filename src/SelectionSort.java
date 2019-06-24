
public class SelectionSort {
	void selectionSort(int[] a) {
	    int min, minPos;
	    for (int i = 0; i < a.length; i++) {
	        min = a[i];
	        minPos = i;
	        for (int j = i; j < a.length; j++) {
	            if (a[j] < min) {
	                min = a[j];
	                minPos = j;
	            }
	        }
	        swap(a, i, minPos);
	    }
	}
	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
