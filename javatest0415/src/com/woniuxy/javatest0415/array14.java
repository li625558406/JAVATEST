package com.woniuxy.javatest0415;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class array14 {
      //����һ������Ϊ10�ľ�̬���飻
        public static void main(String[] args) {
                final int len = 10;
                Random rand = new Random();
                int[] array = new int[len];
                for(int i=0;i<len;i++){//�������飬��д�������
                  int r = rand.nextInt(len);
                  boolean old = false;//�����Ƿ��ظ��ı�ʾ�����ظ�ʱֵΪ�档
                  do{//ѭ����������ɵ��������ֱ������Ĳ����ظ���Ϊֹ
                     old = false;//������д������������ظ���
                    for(int j=0;j<i;j++){//������ǰ���ɵ����֣�����û���뵱ǰ�ظ���
                      if(array[j]==r){
                        old=true;//���õ�ǰ�������ظ��ġ�
                        r = rand.nextInt(len);//���»�ȡ���������
                        break;
                      }
                    }
                  }while(old);
                  array[i] = r;//Ϊ���������Ԫ��
                }
                for(int e:array) {
                        System.out.println(array);
                }
        }
}


