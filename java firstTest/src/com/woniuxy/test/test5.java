package com.woniuxy.test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		/*5�����ʵ�����¹��ܣ��ӿ���̨����������ݡ��·ݡ��գ�
		 * ��������������ǵ���ĵڼ��죬Ч������ͼ��ʾ��
		 * ���Լ����㷨��������java���е�api��*/
				Scanner sca = new Scanner(System.in);
				System.out.println("������ݣ�");
				int year = sca.nextInt();
				System.out.println("�����·ݣ�");
				int mouth = sca.nextInt();
				System.out.println("�����գ�");
				int day = sca.nextInt();
				int num=0,sum1=0,i=1;
				System.out.println("���������"+year+"��"+mouth+"��"+day+"��");
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
