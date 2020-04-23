package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array10 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }
        // 随机产生1000个1到10的整数，判断每个数出现的次数
        
        public static void insert() {
                 int a[]=new int[1000];
                 int b[]=new int[10];
                 for (int i = 0; i < a.length; i++) {
                        a[i]=(int)(Math.random()*10+1);
                        for (int j = 0; j < b.length; j++) {
                                if(a[i]==(j+1)) {
                                        b[j]++;
                                }
                        }
                }
                 for (int i = 0; i < b.length; i++) {
                         System.out.println((i+1)+"的个数"+b[i]);
                 }
                
        }
        public static void main(String[] args) { 
                insert(); 
        }

}
