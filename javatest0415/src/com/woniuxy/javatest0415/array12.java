package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array12 {
                  
        public static void print(int a[]) {
                //��ӡ����
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static int[] insert(int a[],int key) {
                //��һ������������ֲ���һ����
                int temp=a.length;
                for (int i = 0; i < a.length; i++) {
                        //�ж�һ������������ĽǱ�λ��
                        if(key>=a[i]) {
                                temp=i;
                                break;
                        }
                }
                System.out.println(temp);
                int b[]=new int[a.length+1];
                b[temp]=key;
                for (int i = 0; i < a.length; i++) {
                        if(temp>i) {
                                b[i]=a[i];
                        }else {
                                b[i+1]=a[i];
                        }
                }
                return b;      
        }
        public static void main(String[] args) {
                int a[]= {7,6,5,4,2,1,0};
                int key=9;
                int c[]=insert(a,key);
                print(c);     
        }

}
