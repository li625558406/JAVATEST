package com.woniuxy.managers;
import com.woniuxy.entitys.Book;

//完成对图书信息的数据维护
public class BookManager {

	private  int size=5;//容量
	private int count;//实际数的数量
	private Book bs[];
	//创建对象的时候调用此构造方法为数组开辟空间
	public BookManager() {
		// TODO Auto-generated constructor stub
		
		bs=new Book[size];
	}
	
	public BookManager(int size){
		this.size=size;
		bs=new Book[size];
		
	}
	//获得容量
	public int getSize() {
		return size;
	}
	//获得实际的数量
	public int getCount() {
		return count;
	}
	//增加图书
	public void addBook(Book book){
		
		bs[count]=book;
		count++;
		
	}
	
	public  void updateBook(Book newBook){
		//i小于实际书的数量
		for (int i = 0; i < count; i++) {
			if(bs[i].getBookId().equals(newBook.getBookId())){
				
				bs[i]=newBook;
				break;
				
			}
			
		}
		
	}
	
	public void deleteBookById(String bookId){
		//写删除的逻辑
		
		
	
		//删除完之后要count--
		
	}
	
	public Book getBookById(String bookId){
		
		for (int i = 0; i <count; i++) {
			
			if(bs[i].getBookId().equals(bookId)){
				
				return bs[i];
			}
		}
		
		return null;//表示没有找到
		
	}
	
	//判断图书编号是否存在
	public  boolean isExitBookId(String bookId){
		
		//判断bookid在已有的图书中是否存在
		
		return false;
		
	}
	
	
	
	public Book[] getBs() {
		return bs;
	}
	
	
}
