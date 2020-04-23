package com.woniuxy.test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/*2、编程实现n的阶乘，要求（1<n<=10）;*/
				int num = 1,n = 1;
						while (n<10) {
								num = num*(n+1);
								n++;
						}
				System.out.println(num);
	}
}
