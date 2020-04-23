package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array9 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }
        //二分查找法，
        
        public static int insert(int a[],int key) {
                 int low=0,height=a.length-1;
                 int middle=-1;
                 while(low<=height) {
                         middle=(low+height)/2;
                         //System.out.println(middle);
                         if(key==a[middle]) {
                                 return middle;
                                 
                         }
                         if(key<a[middle]) {
                                 height=middle-1;
                         }
                         if(key>a[middle]) {
                                 low=middle+1;
                         }
                 }
                 return -1;
        }
        public static void main(String[] args) {
                int a[]= {1,2,3,5,6,8,9};
                int key=6;
                int b=insert(a,key);
                System.out.println(b);
        }

}
