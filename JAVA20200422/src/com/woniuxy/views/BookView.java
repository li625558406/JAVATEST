package com.woniuxy.views;
import java.util.Scanner;

import com.woniuxy.entitys.Book;
import com.woniuxy.managers.BookManager;


public class BookView {
    
	public void addBookView(BookManager bm){
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("������ͼ����");
	       String bookId=sc.next();
	       System.out.println("������ͼ������");
	       String bookName=sc.next();
	       System.out.println("������ͼ��۸�");
	       double bookPrice=sc.nextDouble();
	       //����Book����
	       
	       Book b=new Book(bookId, bookName, bookPrice);
	       
			bm.addBook(b);
			System.out.println("�Ƿ�Ҫ����");
			ans=sc.next();
		}
	}
	
	//չʾ���е�ͼ��
	public void showBookView(BookManager bm){
		
		Book bs[]=bm.getBs();
		for (int i = 0; i < bm.getCount(); i++) {
			
			System.out.println(bs[i].toString());
		}
		
	}
	
	//չʾһ��ͼ��
	public  void showOneBookView(BookManager bm){
		Scanner sc=new Scanner(System.in);
		System.out.println("������ͼ����");
		String bookId=sc.next();
		
		Book book=bm.getBookById(bookId);
		if(book!=null){
			System.out.println(book.toString());
		}
		else{
			System.out.println("���޴��顣����������");
		}
		
	}
	
	
	public void deleteBookView(BookManager bm){
		
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("������Ҫɾ����ͼ����");
	       String bookId=sc.next();
	        //�����жϱ���Ƿ���ڣ�ͨ������isExitBookId�����ж�
	       
			bm.deleteBookById(bookId);
			System.out.println("�Ƿ�Ҫ����");
			ans=sc.next();
		}
		
	}
}
