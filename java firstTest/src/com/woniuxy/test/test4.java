package com.woniuxy.test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		/*4����������Ϸ
				�����������Ϊ22�꣬�û�����ѭ���ӿ���̨�������䣺
				���������������22�꣬����´��ˣ�
				�����������С��22�꣬��ʾ��С��
				���������������22�꣬��ʾ�¶��ˣ����˳�����
				Ҫ���û������Բ�����*/
				Scanner sca = new Scanner(System.in);
				System.out.println("�²��ҵ����䰡(ֻ�����λ���Ŷ):");
				int age=0;
				int i=0;
						while(i<3) {
								System.out.println("��"+(i+1)+"��");
								age = sca.nextInt();
								if (age>22) {
										System.out.println("�´���");
								}else if (age==22) {
										System.out.println("��ϲ��¶���");
										break;
								}else {
										System.out.println("��С��");
								}
								i++;
						}
	}
}
