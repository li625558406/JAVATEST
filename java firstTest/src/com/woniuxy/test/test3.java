package com.woniuxy.test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		/*3、编程实现：第一天存一元钱,第二天又存2元钱，第三天又存4元钱，以后每天翻1倍,30天后存了多少钱？*/
				int i=0,b=1;
				double a=0;
				while (i<4) {
						a = a+Math.pow(2,i);
						i++;
				}
				System.out.println(a);
	}
}
