package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array7 {
                  
        public static void print(int a[]) {
                //��ӡ����
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static int[] insert(int a[],int b[]) {
                /*4����������������Ԫ��֮��,�������������ʽ����
                {1,2,3,4}+{3,4,5,6}={4,6,8,10}
                {1,2,3,4,5}+{3,4,5,6}={4,6,8,10,5}*/
                
                if(a.length>b.length) {//a�������b�����
                        for (int i = 0; i < b.length; i++) {
                                a[i]=a[i]+b[i];   //b�ĳ����ڵ�����ӣ�a�������ּ���������a��������
                        }
                        return a;
                }else if(a.length==b.length) {
                        for (int i = 0; i < b.length; i++) {
                                a[i]=a[i]+b[i];   
                        }
                        return a;
                }else {
                        for (int i = 0; i < a.length; i++) {
                                b[i]=a[i]+b[i];    
                        }
                        return b;
                }     
        }
        public static void main(String[] args) {
                int a[]= {1,2,4,5,6,7};
                int b[]= {1,2,4,5,6,7,9};
                int []c=insert(a,b);
                print(c);
        }

}
