package com.woniuxy.apps;
import java.security.Permissions;

import com.woniuxy.entitys.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p=new Person("����", '��');
		Person p1=new Person("����", '��');
		
		System.out.println(p.getPersonSex());
	}
}
