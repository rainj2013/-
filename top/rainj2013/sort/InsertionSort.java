package top.rainj2013.sort;

import java.util.Arrays;

public class InsertionSort implements Sort{

	@Override
	public void sort(int[] array) {
		for(int i = 1;i<array.length;i++){
			int temp = array[i],j;
			for(j = i-1;j>=0&&temp<array[j];j--){
				array[j+1] = array[j];
			}
			array[j+1] = temp;
			System.out.println(Arrays.toString(array));
		}
	}
}
