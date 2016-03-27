package top.rainj2013.sort;

import java.util.Arrays;
import java.util.Random;

/** 
* @ClassName TopTen 
* @Description 从大量数据中找出最大的那十个
* @author rainj2013 yangyujian25@gmail.com
* @date 2016年3月27日 下午8:43:13 
*  
*/ 
public class TopTen {
	static final int  SIZE = 10; 
	public int[] topTen(int original[]){
		
		int[] result = Arrays.copyOfRange(original, 0, SIZE);
		//截取数组前十个元素，先排个序吧
		bubbleSort(result);
		
		//迭代取出原数组中剩下的元素，对比截取出来的十个数中最小的那个，如果比最小的大就换掉
		for(int i = SIZE; i<original.length; i++){
			if(original[i]>result[0]){
				result[0] = original[i];
				bubbleSort(result);
			}
		}
		
		return result;
	}
	
	//一个冒泡排序
	private void bubbleSort(int[] result){
		int temp;
		for(int i = 0; i < result.length; i++){
			for(int j = i+1; j<result.length;j++){
				if(result[j]<result[i]){
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TopTen topTen = new TopTen();
		Random r = new Random();
		int[] original = new int[100000];
		for(int i = 0;i<original.length;i++){
			original[i] = r.nextInt(100000);
		}
		long time = System.currentTimeMillis();
		System.out.println(Arrays.toString(topTen.topTen(original)));//用上述方法取出来的十个数
		System.out.println("耗时："+(System.currentTimeMillis()-time));
		//用冒泡排一下再取前10来对比一下作为验证
		time = System.currentTimeMillis();
		topTen.bubbleSort(original);
		System.out.println(Arrays.toString(Arrays.copyOfRange(original, original.length-10, original.length)));
		System.out.println("耗时："+(System.currentTimeMillis()-time));
	}
}
