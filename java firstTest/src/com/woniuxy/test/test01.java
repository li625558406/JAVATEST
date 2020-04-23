package com.woniuxy.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/* 1、标准体型的公式：体重（kg）=身高（cm）-105，从控制台输入自己的体重和身高，
		如果自己的体重和标准体重的差值在±5及其以内，输出体型标准，
		如果小于标准体重5kg，则输出偏瘦，如果大于标准体重5kg则输出偏胖*/
		Scanner sca = new Scanner(System.in);
		System.out.println("输入你的身高(cm)：");
		double height = sca.nextDouble();
		System.out.println("输入你的体重(kg):");
		double weight = sca.nextDouble();
		double BiaoZhun = height-105;
		double a=BiaoZhun-weight;
				if (a<=5&&a>=-5) {
					System.out.println("你的体重很标准");
				}else if(a>5){
					System.out.println("偏瘦");
				}else if(a<-5) {
					System.out.println("偏胖");
				}

	}

}
