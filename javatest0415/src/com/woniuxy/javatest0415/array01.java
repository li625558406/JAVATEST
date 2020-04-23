package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array01 {
                     
        public static int[] insert(int a[],int key) {
                        //数组添加一个数
                int newArray[]=new int[a.length+1];
                for (int i = 0; i < a.length; i++) {
                        newArray[i]=a[i];
                }
                newArray[newArray.length-1]=key;
                newArray[2]=11;
                print(newArray);
                return newArray;
        }
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static void main(String[] args) {
                // TODO Auto-generated method stub
//                Scanner sca=new Scanner(System.in);
//                System.out.println("");
                int a[]= {1,2,3,4,5};
                int key=10;
                print(a);
                insert(a,key);
                

        }

}
