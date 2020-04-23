package com.woniuxy.javatest0415;

import java.util.Scanner;

public class array11 {
                  
        public static void show(int a[]) {
                for(int e : a) {
                        System.out.println(e);
                }
        }
        //冒泡 排序法
        
        public static int[] insert(int a[]) {
                 /*5、定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，统计各成绩等级
                  * （90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，
                  * 60~69分为‘D’，60分以下为E）学生人数，并将其放入到数组count中，其中：count[0]存E级的人数，
                  * count[1]存D级的人数，……，count[4]存A级的人数*/
                int cout[]=new int[5];
                int temp=0;
                for (int i = 0; i < a.length; i++) {
                        if(a[i]>=90) {
                                cout[4]++;     
                        }else if(a[i]>=80&&a[i]<90) {
                                cout[3]++;
                        }else if(a[i]>=70&&a[i]<80) {
                                cout[2]++;
                        }else if(a[i]>=60&&a[i]<70) {
                                cout[1]++;
                        }else {
                                cout[0]++;
                        }
                }
                return cout;
        }
        public static void main(String[] args) {
                int a[]= {72,89,65,58,87,91,53,82,71,93,76,68};
                int []c=insert(a);
                int k=0;
                for (int i = 4; 0<i&&i < c.length; i--) {
                        System.out.println("第"+(char)(k+65)+"人数是"+c[i]);
                        k++;
                }
        }
   }


