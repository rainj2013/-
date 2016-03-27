package top.rainj2013.sort;

import java.util.Arrays;

public class ShellSort implements Sort{

	@Override
	public void sort(int[] array) {
		for(int delta = array.length/2;delta>0;delta/=2){
			for(int i = delta;i<array.length;i++){
				int temp = array[i],j;
				for( j= i-delta;j>=0&&array[j]>temp;j-=delta){
					array[j+delta] = array[j];
				}
				array[j+delta] = temp;
			}
			
			System.out.println(Arrays.toString(array));
		}
	}

}
