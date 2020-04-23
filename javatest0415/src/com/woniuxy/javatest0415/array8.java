package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array8 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }
        //√∞≈› ≈≈–Ú∑®
        
        public static void insert(int a[]) {
                 int temp=0;
                 for (int i = 0; i < a.length-1; i++) {
                        for (int j = 0; j < a.length-i-1; j++) {
                                if(a[j]<a[j+1]) {
                                        temp=a[j];
                                        a[j]=a[j+1];
                                        a[j+1]=temp;
                                }
                        }
                }
        }
        public static void main(String[] args) {
                int a[]= {1,2,4,5,6,7};
                insert(a);
                show(a);
        }

}
