package com.woniuxy.views;
import java.util.Scanner;

import com.woniuxy.entitys.Book;
import com.woniuxy.managers.BookManager;


public class BookView {
    
	public void addBookView(BookManager bm){
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("请输入图书编号");
	       String bookId=sc.next();
	       System.out.println("请输入图书名称");
	       String bookName=sc.next();
	       System.out.println("请输入图书价格");
	       double bookPrice=sc.nextDouble();
	       //创建Book对象
	       
	       Book b=new Book(bookId, bookName, bookPrice);
	       
			bm.addBook(b);
			System.out.println("是否要继续");
			ans=sc.next();
		}
	}
	
	//展示所有的图书
	public void showBookView(BookManager bm){
		
		Book bs[]=bm.getBs();
		for (int i = 0; i < bm.getCount(); i++) {
			
			System.out.println(bs[i].toString());
		}
		
	}
	
	//展示一本图书
	public  void showOneBookView(BookManager bm){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入图书编号");
		String bookId=sc.next();
		
		Book book=bm.getBookById(bookId);
		if(book!=null){
			System.out.println(book.toString());
		}
		else{
			System.out.println("查无此书。。。。。。");
		}
		
	}
	
	
	public void deleteBookView(BookManager bm){
		
		Scanner sc=new Scanner(System.in);
		String ans="y";
		while(ans.equals("y")){
			System.out.println("请输入要删除的图书编号");
	       String bookId=sc.next();
	        //可以判断编号是否存在，通过调用isExitBookId方法判断
	       
			bm.deleteBookById(bookId);
			System.out.println("是否要继续");
			ans=sc.next();
		}
		
	}
}
