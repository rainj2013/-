package top.rainj2013.sort;

import java.util.Arrays;

public class BubbleSort implements Sort{

	@Override
	public void sort(int[] array) {
		int temp;
		for(int i = 0; i< array.length;i++){
			for(int j = i+1;j<array.length;j++){
				if(array[j]<array[i]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

}
