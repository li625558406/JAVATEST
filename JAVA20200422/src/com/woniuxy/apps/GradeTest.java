package com.woniuxy.apps;
import java.util.Scanner;

import com.woniuxy.managers.Grade;
import com.woniuxy.views.GradeView;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   	//������ֱ����������
		Grade g=new Grade(5);
		GradeView gv=new GradeView();
		
		while(true){
			System.out.println("1.����ѧ��");
			System.out.println("2.չʾѧ��");
			System.out.println("3.�޸�ѧ��");
			System.out.println("4.ɾ��ѧ��");
			System.out.println("5.���ð�����");
			System.out.println("6.��ʾ��������Ϣ");
			System.out.println("��ѡ��");
			int se=sc.nextInt();
			switch (se) {
			case 1:
				//�������ӽ���
				gv.addStudentView(g);
				break;
			case 2:
				//����չʾ����
				gv.showStudentView(g);
				break;
			case 3:
				//�����޸Ľ���
				gv.updateStudentView(g);
				break;
			case 4:
				//����ɾ������
				gv.deleteStudentView(g);
				break;
			case 5:
				//�������ð����ν���
				gv.setTeacherView(g);
				break;
			case 6:
				//չʾ��������Ϣ
				gv.showTeacherView(g);
				break;
			default:
				break;
			}
		
		}
		
		
	   	
		
	}
}
