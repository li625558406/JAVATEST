package com.woniuxy.managers;
import com.woniuxy.entitys.Student;
import com.woniuxy.entitys.Teacher;

//负责管理学生（负责接收数据，返回数据，至于数据是从哪来的，调用者如何展示数据，不关心）
public class Grade {

	private int size=30;//最大容量；
	private int count;//班级的实际人数，随着增加学生，删除学生而发生变换
	private Teacher teacher;//班级有班主任属性
	private Student students[];//代表很多个学生
	
	public Grade() {
		// TODO Auto-generated constructor stub
		
		students=new Student[size];
	}
	public Grade(int size){
		this.size=size;
		
		students=new Student[size];
		
	}
	
	//获得最大容量
	public int getSize() {
		return size;
	}
	//获得班级的实际人数
	public int getCount() {
		return count;
	}
	
	//设置班主任
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	//得到班主任对象
	public Teacher getTeacher() {
		return teacher;
	}
	//增加学生(参数代表要增加的学生对象)
	
	public  void addStudent(Student s){
		//将学生放到数组中
		students[count]=s;
		//学生人数加1
		count++;
		
	}
	//删除学生
	
	public  void deleteStudentById(String studentId){
		//存放删除的学生在数组中的位置
		int index=-1;
		for (int i = 0; i < count; i++) {
			if(students[i].getStudentId().equals(studentId)){
				
				index=i;
				break;
			}
		}
		
		if(index!=-1){
			
			for (int i = index; i < count-1; i++) {
				students[i]=students[i+1];
			}
			
			students[count-1]=null;
			
			//人数减1
			count--;
			
		}
		
	}
	//修改学生  001（学号不更改）  张三 
	public void updateStudent(Student student){
		//遍历寻找修改的学生对象，然后进行替换
		for (int i = 0; i < count; i++) {
			//判断数组中已有学生的学号和传入的学生信息的学号是否一致
			if(students[i].getStudentId().equals(student.getStudentId())){
				//将数组中找到的位置的元素替换为传入的学生对象
				students[i]=student;
				break;
			}
		}
		
	}
	
	//修改学生
	//获得所有的学生信息
	
	public Student[] getStudents() {
		return students; 
	}
	//班级有没有放满
	public boolean isFull(){
		
		return count==size;
	}
	//班级是否Wie空
	public  boolean isEmpty(){
		
		return count==0;
	}
	
	//判断学号是否存在
	public  boolean isExitStudentId(String studentId){
		
		
		for (int i = 0; i < count; i++) {
			if(students[i].getStudentId().equals(studentId)){
				
				return true;
			}
		}
		
		return false;
		
	}
}
