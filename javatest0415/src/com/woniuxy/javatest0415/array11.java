package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array11 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }
        //ð�� ����
        
        public static int[] insert(int a[]) {
                 /*5������һ���������洢12��ѧ���ĳɼ�{72,89,65,58,87,91,53,82,71,93,76,68}��ͳ�Ƹ��ɼ��ȼ�
                  * ��90������Ϊ��A����80~89��Ϊ��B����70~79��Ϊ��C����
                  * 60~69��Ϊ��D����60������ΪE��ѧ����������������뵽����count�У����У�count[0]��E����������
                  * count[1]��D����������������count[4]��A��������*/
                int cout[]=new int[5];
                int temp=0;
                for (int i = 0; i < a.length; i++) {
                        if(a[i]>=90) {
                                cout[4]++;     
                        }else if(a[i]>=80&&a[i]<90) {
                                cout[3]++;
                        }else if(a[i]>=70&&a[i]<80) {
                                cout[2]++;
                        }else if(a[i]>=60&&a[i]<70) {
                                cout[1]++;
                        }else {
                                cout[0]++;
                        }
                }
                return cout;
        }
        public static void main(String[] args) {
                int a[]= {72,89,65,58,87,91,53,82,71,93,76,68};
                int []c=insert(a);
                int k=0;
                for (int i = 4; 0<i&&i < c.length; i--) {
                        System.out.println("��"+(char)(k+65)+"������"+c[i]);
                        k++;
                }
        }
   }


