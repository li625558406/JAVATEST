package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array13 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }

        
        public static int[] insert(int a[]) {
                 /*7、在一个长度为9的数组存放1到9之间的随机整数，要求，数组的每个位置的随机整数不能重复
                                        如 1 2 3 5 9 8 7 6 4*/
                int b[]=new int[9];
                for (int i = 0; i < b.length; i++) {
                        b[i]=(int)(Math.random()*100%9+1);       
                }
                for (int j = 0; j < b.length-1; j++) {
                        for (int k = 0; k < b.length; k++) {
                                if(b[j]==b[j]) {
                                        //if(b[j]==b[k]&&j==k)
                                        continue;
                                        
                                }//k=-1;
                                        while(b[j]==b[k+1]) {
                                                b[k+1]=(int)(Math.random()*100%9+1);
                                        }
                                
                
                        }
                        
               // return -1;
                }
                return b;
        }
        public static void main(String[] args) {
                int b[]= new int[9];
                int []c=insert(b);
                show(c);
                
        }
   }


