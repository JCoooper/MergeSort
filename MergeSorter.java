
public class MergeSorter {
	// private static int[] a;
	private static int[] b;

	public static void mergeSort(int[] list, int lo, int hi) {

		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}

	}

	public static void merge(int[] list, int lo, int mid, int hi) {
		int[] a = new int[list.length + 1];
		System.arraycopy(list, 0, a, 0, list.length);

		for (int i = lo; i <= hi; i++) {
			a[i] = list[i];
		}

		int l2 = lo;
		int m2 = mid + 1;
		int l3 = lo;
		while (l2 <= mid && m2 <= hi) {
			if (a[l2] <= a[m2]) {
				list[l3] = a[l2];
				l2++;
			} else {
				list[l3] = a[m2];
				m2++;
			}
			l3++;
		}
		while (l2 <= mid) {
			list[l3] = a[l2];
			l3++;
			l2++;
		}
	}

}
