package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array5 {
                  
        public static void print(int a[]) {
                //��ӡ����
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static void insert(int a[],int b[]) {
                //�ж����������Ƿ���ȣ���������ĳ��Ⱥ������Ӧλ�õ�Ԫ�ض���Ȳ�Ϊ��ȣ�
                if(a.length==b.length) {
                        for (int i = 0; i < b.length; i++) {
                                if(a[i]!=b[i]) {
                                        System.out.println("�����");
                                        break;
                                }else {
                                        System.out.println("���");
                                        break;
                                }
                        }
                }else {
                        System.out.println("�����");
                }
                
        }
        public static void main(String[] args) {
                int a[]= {1,2,4,5,6,7};
                int b[]= {1,2,4,5,6,7,90};
                insert(a,b);
        }

}
