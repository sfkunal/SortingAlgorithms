
public class MergeSort {
	public static void mergesort(int[] arr) {
	    ms(arr, 0, arr.length-1);
	}
	    
	private static void ms(int[] a, int low, int high) {
	    if (low < high) {
	        int mid = (low + high) / 2;
	        ms(a, low, mid);
	        ms(a, mid+1, high);
	        merge(a, low, mid, high);
	    }
	}

	private static void merge (int[] a, int low, int mid, int high) {
	    int[] b = new int[a.length];
	    int i, j, k;

	    for (i = low; i <= high; i++)
	        b[i]=a[i];

	    i = low; j = mid+1; k = low;
	    while (i <= mid && j <= high)
	        if (b[i]<=b[j])
	            a[k++]=b[i++];
	        else
	            a[k++]=b[j++];

	    while (i <= mid)
	        a[k++]=b[i++];
	}
}
