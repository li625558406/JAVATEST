package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array13 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }

        
        public static int[] insert(int a[]) {
                 /*7����һ������Ϊ9��������1��9֮������������Ҫ�������ÿ��λ�õ�������������ظ�
                                        �� 1 2 3 5 9 8 7 6 4*/
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


