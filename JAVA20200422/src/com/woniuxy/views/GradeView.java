package com.woniuxy.views;
import java.util.Scanner;

import com.woniuxy.entitys.Student;
import com.woniuxy.entitys.Teacher;
import com.woniuxy.managers.Grade;

/*负责信息的录入和展示*/
public class GradeView {

	
	//增加界面
	public  void addStudentView(Grade grade){
		Scanner sc=new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("请输入学生编号");
			String  studentId=sc.next();
			if(grade.isExitStudentId(studentId)){
				System.out.println("学号重复,请重新输入");
				continue;
				
			}
			
			System.out.println("请输入学生名称");
			String  studentName=sc.next();
			
			//创建一个学生对象
			
			Student s=new Student(studentId,studentName);
			//将学生信息放到班级中
			
			grade.addStudent(s);
			
			//判断班级是否慢了
			if(grade.isFull()){
				
				System.out.println("班级人数已满");
				break;
			}
			System.out.println("您是否要继续");
			ans=sc.next();
	   	}
		
		
	}
	
	
	//展示所有学生信息的界面(如何展示，用什么样的形式展示)
	public void showStudentView(Grade  grade){
		//得到存放所有学生信息的数组
		Student stus[]=grade.getStudents();
		for (int i = 0; i < grade.getCount();i++) {
			System.out.println(stus[i].toString());
		}
	}
	
	
	public  void deleteStudentView(Grade  grade){
		
		Scanner sc= new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("请输入要删除的学生的学号");
			String studentId=sc.next();
			//判断学号是否存在，如果不存在，给出合理提示
			if(!grade.isExitStudentId(studentId)){
				System.out.println("您输入的学号不存在,请重新输入");
				continue;
				
			}
			grade.deleteStudentById(studentId);
			System.out.println("是否要继续");
			ans=sc.next();
	   	}
		
	}
	
	
	public void updateStudentView(Grade grade){
		
		Scanner sc=new Scanner(System.in);
		String ans="y";
	   	while(ans.equals("y")){
			System.out.println("请输入要修改的学生编号");
			String  studentId=sc.next();
		   
			
			System.out.println("请输入修改后的学生名称");
			String  studentName=sc.next();
			
			//创建一个学生对象
			
			Student s=new Student(studentId,studentName);
			//调用班级的修改方法进行修改
			
			grade.updateStudent(s);
			
			
			System.out.println("您是否要继续");
			ans=sc.next();
	   	}
		
	}
	
	public  void  setTeacherView(Grade grade){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入老师名称");
		String teacherName=sc.next();
		System.out.println("请输入老师所受的课程");
		String teacherCourse=sc.next();
		//创建一个老师对象
		Teacher t=new Teacher(teacherName, teacherCourse);
		//给班级设置班主任
		grade.setTeacher(t);
		
	}
	
	public  void  showTeacherView(Grade grade){
		//得到班级的班主任
		Teacher teacher=grade.getTeacher();
		//输出班主任的信息
		System.out.println(teacher.toString());
		
	}
}
