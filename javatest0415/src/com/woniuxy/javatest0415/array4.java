package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array4 {
                  
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
                        if(key<=a[i]) {
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
                // TODO Auto-generated method stub
//                Scanner sca=new Scanner(System.in);
//                System.out.println("");
                int a[]= {1,2,4,5,6,7};
                int key=3;
                int c[]=insert(a,key);
                print(c);
                

        }

}
