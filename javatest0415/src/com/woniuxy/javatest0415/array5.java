package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array5 {
                  
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }
                System.out.println();
                
        }
        
        public static void insert(int a[],int b[]) {
                //判断两个数组是否相等（两个数组的长度和数组对应位置的元素都相等才为相等）
                if(a.length==b.length) {
                        for (int i = 0; i < b.length; i++) {
                                if(a[i]!=b[i]) {
                                        System.out.println("不相等");
                                        break;
                                }else {
                                        System.out.println("相等");
                                        break;
                                }
                        }
                }else {
                        System.out.println("不相等");
                }
                
        }
        public static void main(String[] args) {
                int a[]= {1,2,4,5,6,7};
                int b[]= {1,2,4,5,6,7,90};
                insert(a,b);
        }

}
