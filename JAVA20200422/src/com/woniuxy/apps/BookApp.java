package com.woniuxy.apps;
import java.util.Scanner;

import com.woniuxy.managers.BookManager;
import com.woniuxy.views.BookView;

public class BookApp {

	public static void main(String[] args) {
		
		BookView bookView=new BookView();
		BookManager bm=new BookManager();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.增加图书");
			System.out.println("2.删除图书");
			System.out.println("3.展示所有图书信息");
			System.out.println("4.查找图书");
			System.out.println("5.修改图书");
			
			System.out.println("请选择");
			int se=sc.nextInt();
			
			switch (se) {
			case 1:
				bookView.addBookView(bm);
				break;
			case 2:
				bookView.deleteBookView(bm);
				break;
			case 3:
				bookView.showBookView(bm);
				break;
			case 4:
				bookView.showOneBookView(bm);
				break;
			case 5:
				//启动修改界面
				break;
			default:
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
