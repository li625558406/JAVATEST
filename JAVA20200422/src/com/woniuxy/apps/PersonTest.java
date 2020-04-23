package com.woniuxy.apps;
import java.security.Permissions;

import com.woniuxy.entitys.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p=new Person("张三", '男');
		Person p1=new Person("张三", '男');
		
		System.out.println(p.getPersonSex());
	}
}
