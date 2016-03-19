package top.rainj2013.sort;

public class BucketSort implements Sort{
	
	private int max;//桶排序需要知道需要排序的数列中最大的数字
	
	public BucketSort(int max) {
		this.max = max;
	}
	
	@Override
	public void sort(int[] array) {
		int[] count = new int[max+1];
		
		for(int i = 0;i<array.length;i++){
			count[array[i]] = count[array[i]]+1;
		}
		
		for(int i = 0;i<count.length;i++){
			if(count[i]!=0){
				for(int j = 0;j<count[i];j++){
					System.out.println(i);
				}
			}
		}
		
	}
}
