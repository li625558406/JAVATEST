package com.woniuxy.views;
import java.util.Scanner;

import com.woniuxy.entitys.Student;
import com.woniuxy.entitys.Teacher;
import com.woniuxy.managers.Grade;

/*������Ϣ��¼���չʾ*/
public class GradeView {

	
	//���ӽ���
	public  void addStudentView(Grade grade){
		Scanner sc=new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("������ѧ�����");
			String  studentId=sc.next();
			if(grade.isExitStudentId(studentId)){
				System.out.println("ѧ���ظ�,����������");
				continue;
				
			}
			
			System.out.println("������ѧ������");
			String  studentName=sc.next();
			
			//����һ��ѧ������
			
			Student s=new Student(studentId,studentName);
			//��ѧ����Ϣ�ŵ��༶��
			
			grade.addStudent(s);
			
			//�жϰ༶�Ƿ�����
			if(grade.isFull()){
				
				System.out.println("�༶��������");
				break;
			}
			System.out.println("���Ƿ�Ҫ����");
			ans=sc.next();
	   	}
		
		
	}
	
	
	//չʾ����ѧ����Ϣ�Ľ���(���չʾ����ʲô������ʽչʾ)
	public void showStudentView(Grade  grade){
		//�õ��������ѧ����Ϣ������
		Student stus[]=grade.getStudents();
		for (int i = 0; i < grade.getCount();i++) {
			System.out.println(stus[i].toString());
		}
	}
	
	
	public  void deleteStudentView(Grade  grade){
		
		Scanner sc= new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("������Ҫɾ����ѧ����ѧ��");
			String studentId=sc.next();
			//�ж�ѧ���Ƿ���ڣ���������ڣ�����������ʾ
			if(!grade.isExitStudentId(studentId)){
				System.out.println("�������ѧ�Ų�����,����������");
				continue;
				
			}
			grade.deleteStudentById(studentId);
			System.out.println("�Ƿ�Ҫ����");
			ans=sc.next();
	   	}
		
	}
	
	
	public void updateStudentView(Grade grade){
		
		Scanner sc=new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("������Ҫ�޸ĵ�ѧ�����");
			String  studentId=sc.next();
		   
			
			System.out.println("�������޸ĺ��ѧ������");
			String  studentName=sc.next();
			
			//����һ��ѧ������
			
			Student s=new Student(studentId,studentName);
			//���ð༶���޸ķ��������޸�
			
			grade.updateStudent(s);
			
			
			System.out.println("���Ƿ�Ҫ����");
			ans=sc.next();
	   	}
		
	}
	
	public  void  setTeacherView(Grade grade){
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ʦ����");
		String teacherName=sc.next();
		System.out.println("��������ʦ���ܵĿγ�");
		String teacherCourse=sc.next();
		//����һ����ʦ����
		Teacher t=new Teacher(teacherName, teacherCourse);
		//���༶���ð�����
		grade.setTeacher(t);
		
	}
	
	public  void  showTeacherView(Grade grade){
		//�õ��༶�İ�����
		Teacher teacher=grade.getTeacher();
		//��������ε���Ϣ
		System.out.println(teacher.toString());
		
	}
}
