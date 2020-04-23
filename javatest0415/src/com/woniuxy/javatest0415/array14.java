package com.woniuxy.javatest0415;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class array14 {
      //定义一个长度为10的静态数组；
        public static void main(String[] args) {
                final int len = 10;
                Random rand = new Random();
                int[] array = new int[len];
                for(int i=0;i<len;i++){//遍历数组，填写随机数。
                  int r = rand.nextInt(len);
                  boolean old = false;//声明是否重复的标示符，重复时值为真。
                  do{//循环检查新生成的随机数，直到它真的不是重复的为止
                     old = false;//假设填写的随机数不是重复的
                    for(int j=0;j<i;j++){//遍历以前生成的数字，看有没有与当前重复的
                      if(array[j]==r){
                        old=true;//设置当前数，是重复的。
                        r = rand.nextInt(len);//重新获取新随机数。
                        break;
                      }
                    }
                  }while(old);
                  array[i] = r;//为数组添加新元素
                }
                for(int e:array) {
                        System.out.println(array);
                }
        }
}


