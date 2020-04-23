 package com.woniuxy.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class javaExam4 {
	
	/*4 从键盘依次输入10个正整数，要求每次存储到数组中的时候，
	 * 保证其顺序为升序（从小到大），注意：是边存边排。*/
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int a[]=new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("输入第"+(i+1)+"个数：");
			a[i]=sca.nextInt();
			if(i>1) {
				for (int k = 1; k < i+1; k++) {
					int key=a[k];
					int j=k-1;
					while(j>=0&&key<a[j]) {
						a[j+1]=a[j];
						j--;
					}
					
					a[j+1]=key;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	
	
	
	}
		
}

