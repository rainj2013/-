package top.rainj2013.sort;

import java.util.Arrays;

public class QuickSort implements Sort {

	@Override
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int begin, int end) {
		if (begin < end) {
			int i = begin, j = end;
			int vot = array[i];
			while (i != j) {
				while (i < j && array[j] > vot) {
					j--;
				}
				if (i < j) {
					array[i++] = array[j];
				}
				while (i < j && array[i] < vot) {
					i++;
				}
				if (i < j) {
					array[j--] = array[i];
				}
			}
			array[i] = vot;
			System.out.println(Arrays.toString(array));
			quickSort(array, begin, i-1);
			quickSort(array, i+1, end);
		}
	}

}
