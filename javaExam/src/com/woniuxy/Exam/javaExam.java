package com.woniuxy.Exam;

import java.util.Arrays;

public class javaExam {
	
	/*1��������1��{1,8,9,2,4},
	 * ����2:{2,4,5,6,1,10},
	 * Ҫ�����������е�Ԫ��ȫ���ŵ�һ���������У�
	 * Ȼ�������鰴���������������*/
	public static void main(String[] args) {
		
		int a[]= {1,8,9,2,4};
		int b[]= {2,4,5,6,1,10};
		int sum[]= new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			sum[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sum[a.length+i]=b[i];
		}	
		change(sum);	
		
		
		
	}
	
	
	public static void change(int a[]) {
		
		
		for (int i = 1; i < a.length; i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0&&key<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));
		
	}
		
	
}
