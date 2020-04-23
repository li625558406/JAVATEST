 package com.woniuxy.Exam;

import java.util.Arrays;

public class javaExam3 {
	
	/*3设级数Sn定义为S0=0，S1=1，Sn=S(n-1)+2*S(n-2) (n>=2)，
	 * 将前十项放入数组中，并在控制台输出；进而计算前10项之和，并打印输出。*/
	public static void main(String[] args) {
		int a=0;
		int sum=0;
		int array[]=new int [10];
		for (int i = 0; i < 10; i++) {
			array[i]=i;
			if(i>=2) {
				
				array[i]=array[i-1]+2*array[i-2];
				
			}
		}
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			sum=array[i]+sum;
		}
		System.out.println("总和："+sum);
		
	}
		
}

