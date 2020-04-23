package com.woniuxy.managers;
import com.woniuxy.entitys.Book;

//��ɶ�ͼ����Ϣ������ά��
public class BookManager {

	private  int size=5;//����
	private int count;//ʵ����������
	private Book bs[];
	//���������ʱ����ô˹��췽��Ϊ���鿪�ٿռ�
	public BookManager() {
		// TODO Auto-generated constructor stub
		
		bs=new Book[size];
	}
	
	public BookManager(int size){
		this.size=size;
		bs=new Book[size];
		
	}
	//�������
	public int getSize() {
		return size;
	}
	//���ʵ�ʵ�����
	public int getCount() {
		return count;
	}
	//����ͼ��
	public void addBook(Book book){
		
		bs[count]=book;
		count++;
		
	}
	
	public  void updateBook(Book newBook){
		//iС��ʵ���������
		for (int i = 0; i < count; i++) {
			if(bs[i].getBookId().equals(newBook.getBookId())){
				
				bs[i]=newBook;
				break;
				
			}
			
		}
		
	}
	
	public void deleteBookById(String bookId){
		//дɾ�����߼�
		
		
	
		//ɾ����֮��Ҫcount--
		
	}
	
	public Book getBookById(String bookId){
		
		for (int i = 0; i <count; i++) {
			
			if(bs[i].getBookId().equals(bookId)){
				
				return bs[i];
			}
		}
		
		return null;//��ʾû���ҵ�
		
	}
	
	//�ж�ͼ�����Ƿ����
	public  boolean isExitBookId(String bookId){
		
		//�ж�bookid�����е�ͼ�����Ƿ����
		
		return false;
		
	}
	
	
	
	public Book[] getBs() {
		return bs;
	}
	
	
}
