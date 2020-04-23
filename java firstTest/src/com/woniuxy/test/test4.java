package com.woniuxy.test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		/*4、猜年龄游戏
				假设你的年龄为22岁，用户可以循环从控制台输入年龄：
				输入年龄如果大于22岁，输出猜大了，
				输入年龄如果小于22岁，显示猜小了
				输入年龄如果等于22岁，显示猜对了，并退出程序
				要求：用户最多可以猜三次*/
				Scanner sca = new Scanner(System.in);
				System.out.println("猜猜我的年龄啊(只有三次机会哦):");
				int age=0;
				int i=0;
						while(i<3) {
								System.out.println("第"+(i+1)+"次");
								age = sca.nextInt();
								if (age>22) {
										System.out.println("猜大了");
								}else if (age==22) {
										System.out.println("恭喜你猜对了");
										break;
								}else {
										System.out.println("猜小了");
								}
								i++;
						}
	}
}
