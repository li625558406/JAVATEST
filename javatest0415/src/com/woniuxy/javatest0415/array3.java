package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array3 {
                  
        public static void print(int a[]) {
                //打印数组
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i]+"\t");
                }     
        }
        
        public static int[] insert(int a[],int key) {
                //删除一个数
                int temp=-1;
                        for (int i = 0; i < a.length; i++) {  
                                if(key==a[i]) {
                                        temp=i;
                                        break;
                                }
                                
                        }
                        if(temp!=-1) {
                                int b[]=new int[a.length-1] ;
                                for (int j = 0; j < a.length; j++) {
                                               if(temp>j) {
                                                       b[j]=a[j];
                                               }else if(temp<j){
                                                       b[j-1]=a[j];
                                               }      
                                }
                                return b;
                        }else {
                                return a;
                        }   
        }
        public static void main(String[] args) {
                // TODO Auto-generated method stub
//                Scanner sca=new Scanner(System.in);
//                System.out.println("");
                int a[]= {1,2,34,5,6,7};
                int key=6;
                int c[]=insert(a,key);
                print(c);
                

        }

}
