package com.woniuxy.Exam;

import java.util.Arrays;

public class javaExam2 {
	
	/*2将一个数组的奇数索引位拷贝到另一个数组中前半部分
		,偶数索引位数字拷贝到后半部分
       {1,2,3,4,5}   =  {2,4,1,3,5}*/
	public static void main(String[] args) {
		
		int a[]= {2,5,7,2,3,9,12,23,55,4};	
		int sum[]=new int[10];
		int count=0;
		int count1=9;
		for (int i = 0; i < sum.length; i++) {
			if(a[i]%2==1) {
				sum[count]=a[i];
				count++;
			}
		}
		for (int i = 0; i < sum.length; i++) {
			if(a[i]%2==0) {
				sum[count]=a[i];
				count++;
			}
		}
		
		System.out.println(Arrays.toString(sum));
		
	}
	
}

