package com.woniuxy.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/* 1����׼���͵Ĺ�ʽ�����أ�kg��=��ߣ�cm��-105���ӿ���̨�����Լ������غ���ߣ�
		����Լ������غͱ�׼���صĲ�ֵ�ڡ�5�������ڣ�������ͱ�׼��
		���С�ڱ�׼����5kg�������ƫ�ݣ�������ڱ�׼����5kg�����ƫ��*/
		Scanner sca = new Scanner(System.in);
		System.out.println("����������(cm)��");
		double height = sca.nextDouble();
		System.out.println("�����������(kg):");
		double weight = sca.nextDouble();
		double BiaoZhun = height-105;
		double a=BiaoZhun-weight;
				if (a<=5&&a>=-5) {
					System.out.println("������غܱ�׼");
				}else if(a>5){
					System.out.println("ƫ��");
				}else if(a<-5) {
					System.out.println("ƫ��");
				}

	}

}
