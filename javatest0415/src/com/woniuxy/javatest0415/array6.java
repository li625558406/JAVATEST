package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array6 {
        
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }     
        }
        
        public static int[] insert(int a[]) {
                //3、将一个数组中的奇数元素复制到另外一个数组中
                
                int temp=0;
                for (int i = 0; i < a.length; i++) {
                        //判断偶数有几个确定数组b的大小
                        if(a[i]%2==0) {
                                temp=temp+1;
                        }
                }
                int []b=new int[temp];
                int k=0;
                for (int i = 0; i < a.length; i++) {
                        //吧偶数给数组b
                        if(a[i]%2==0) {
                                b[k]=a[i];
                                k++;
                        }else{
                                
                        }
                }
                return b;
          
        }
        public static void main(String[] args) {
                int a[]= {1,2,4,5,6,7};
                int []c=insert(a);
                print(c);
        }
}
