package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array7 {
                  
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static int[] insert(int a[],int b[]) {
                /*4、求两个整形数组元素之和,将和以数组的形式返回
                {1,2,3,4}+{3,4,5,6}={4,6,8,10}
                {1,2,3,4,5}+{3,4,5,6}={4,6,8,10,5}*/
                
                if(a.length>b.length) {//a的数组比b数组大，
                        for (int i = 0; i < b.length; i++) {
                                a[i]=a[i]+b[i];   //b的长度内的数相加，a超出部分继续保持在a数组里面
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
