package top.rainj2013.sort;

import org.junit.Test;

public class SortTest {
	@Test
	public void test() {
		Sort sort;
		int[] array = { 32, 26, 87, 72, 26, 17 };
		//sort = new InsertionSort();
		//sort = new BubbleSort();
		//sort = new QuickSort();
		//sort = new SelectSort();
		sort = new BucketSort(87);
		sort.sort(array);
	}
}
