package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array2 {
                  
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static int[] insert(int a[],int key) {
                //增加数组一格
                int arry[]=new int[a.length+1];
                for (int i = 0; i < a.length; i++) {
                        arry[i]=a[i];
                        
                }
                arry[a.length]=key;
                print(arry);
                return arry;        
        }
        public static void main(String[] args) {
                // TODO Auto-generated method stub
//                Scanner sca=new Scanner(System.in);
//                System.out.println("");
                int a[]= {1,2,34,5,6,7};
                int key=102;
                int c[]=insert(a,key);
                print(c);
                

        }

}
