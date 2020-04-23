package com.woniuxy.test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		/*5、编程实现如下功能，从控制台输入任意年份、月份、日，
		 * 计算输入的日期是当年的第几天，效果如下图所示：
		 * （自己想算法，不利用java已有的api）*/
				Scanner sca = new Scanner(System.in);
				System.out.println("输入年份：");
				int year = sca.nextInt();
				System.out.println("输入月份：");
				int mouth = sca.nextInt();
				System.out.println("输入日：");
				int day = sca.nextInt();
				int num=0,sum1=0,i=1;
				System.out.println("你输入的是"+year+"年"+mouth+"月"+day+"日");
					while (i<mouth) {
						switch(i) {
								case 1:case 3:case 5:case 7:case 8:case 10:case 12:num=31;break;
								case 2:if(year%4==0&&year%100!=0||year%100==0&&year%400==0) {
									num=29;
									break;
								}else {
									num=28;
									break;
								}
								case 4:case 6:case 9:case 11:num=30;break;
						}
						sum1=sum1+num;
						i++;
					}
					sum1=sum1+day;
				System.out.println(sum1);
	}
}
