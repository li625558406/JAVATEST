 package com.woniuxy.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class javaExam5 {
	
	/*5、将一个数组的指定位置范围中的数反序，如 {1,2,3,4,5,6},
	 * 将下标位置1到下标位置3的部分反序为{1,4,3,2,5,6}*/
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int a[]= {2,4,6,8,10,12,14,16,18,20,22,24};
		System.out.println("输入下标从几到几:");
		int num=sca.nextInt();
		int num2=sca.nextInt();
			for (int k = num+1; k < num2+1; k++) {
				int key=a[k];
				int j=k-1;
				while(j>=0&&key>a[j]) {
					a[j+1]=a[j];
					j--;
				}
				
				a[j+1]=key;
			}
		
		System.out.println(Arrays.toString(a));
	
	}
		
}

