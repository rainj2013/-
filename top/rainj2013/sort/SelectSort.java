package top.rainj2013.sort;

import java.util.Arrays;

public class SelectSort implements Sort {

	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}

			if (min != i) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			
			System.out.println(Arrays.toString(array));
		}
	}
}
