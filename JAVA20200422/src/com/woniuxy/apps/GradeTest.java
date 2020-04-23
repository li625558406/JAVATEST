package com.woniuxy.apps;
import java.util.Scanner;

import com.woniuxy.managers.Grade;
import com.woniuxy.views.GradeView;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   	//主方法直接启动界面
		Grade g=new Grade(5);
		GradeView gv=new GradeView();
		
		while(true){
			System.out.println("1.增加学生");
			System.out.println("2.展示学生");
			System.out.println("3.修改学生");
			System.out.println("4.删除学生");
			System.out.println("5.设置班主任");
			System.out.println("6.显示班主任信息");
			System.out.println("请选择");
			int se=sc.nextInt();
			switch (se) {
			case 1:
				//启动增加界面
				gv.addStudentView(g);
				break;
			case 2:
				//启动展示界面
				gv.showStudentView(g);
				break;
			case 3:
				//启动修改界面
				gv.updateStudentView(g);
				break;
			case 4:
				//启动删除界面
				gv.deleteStudentView(g);
				break;
			case 5:
				//启动设置班主任界面
				gv.setTeacherView(g);
				break;
			case 6:
				//展示班主任信息
				gv.showTeacherView(g);
				break;
			default:
				break;
			}
		
		}
		
		
	   	
		
	}
}
