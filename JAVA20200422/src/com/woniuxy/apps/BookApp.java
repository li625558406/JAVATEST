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
			System.out.println("1.����ͼ��");
			System.out.println("2.ɾ��ͼ��");
			System.out.println("3.չʾ����ͼ����Ϣ");
			System.out.println("4.����ͼ��");
			System.out.println("5.�޸�ͼ��");
			
			System.out.println("��ѡ��");
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
				//�����޸Ľ���
				break;
			default:
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
