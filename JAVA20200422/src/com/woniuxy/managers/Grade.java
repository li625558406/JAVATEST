package com.woniuxy.managers;
import com.woniuxy.entitys.Student;
import com.woniuxy.entitys.Teacher;

//�������ѧ��������������ݣ��������ݣ����������Ǵ������ģ����������չʾ���ݣ������ģ�
public class Grade {

	private int size=30;//���������
	private int count;//�༶��ʵ����������������ѧ����ɾ��ѧ���������任
	private Teacher teacher;//�༶�а���������
	private Student students[];//����ܶ��ѧ��
	
	public Grade() {
		// TODO Auto-generated constructor stub
		
		students=new Student[size];
	}
	public Grade(int size){
		this.size=size;
		
		students=new Student[size];
		
	}
	
	//����������
	public int getSize() {
		return size;
	}
	//��ð༶��ʵ������
	public int getCount() {
		return count;
	}
	
	//���ð�����
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	//�õ������ζ���
	public Teacher getTeacher() {
		return teacher;
	}
	//����ѧ��(��������Ҫ���ӵ�ѧ������)
	
	public  void addStudent(Student s){
		//��ѧ���ŵ�������
		students[count]=s;
		//ѧ��������1
		count++;
		
	}
	//ɾ��ѧ��
	
	public  void deleteStudentById(String studentId){
		//���ɾ����ѧ���������е�λ��
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
			
			//������1
			count--;
			
		}
		
	}
	//�޸�ѧ��  001��ѧ�Ų����ģ�  ���� 
	public void updateStudent(Student student){
		//����Ѱ���޸ĵ�ѧ������Ȼ������滻
		for (int i = 0; i < count; i++) {
			//�ж�����������ѧ����ѧ�źʹ����ѧ����Ϣ��ѧ���Ƿ�һ��
			if(students[i].getStudentId().equals(student.getStudentId())){
				//���������ҵ���λ�õ�Ԫ���滻Ϊ�����ѧ������
				students[i]=student;
				break;
			}
		}
		
	}
	
	//�޸�ѧ��
	//������е�ѧ����Ϣ
	
	public Student[] getStudents() {
		return students; 
	}
	//�༶��û�з���
	public boolean isFull(){
		
		return count==size;
	}
	//�༶�Ƿ�Wie��
	public  boolean isEmpty(){
		
		return count==0;
	}
	
	//�ж�ѧ���Ƿ����
	public  boolean isExitStudentId(String studentId){
		
		
		for (int i = 0; i < count; i++) {
			if(students[i].getStudentId().equals(studentId)){
				
				return true;
			}
		}
		
		return false;
		
	}
}
