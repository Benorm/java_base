package com.javalec.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> hashSet = new ArrayList<Student>();
		hashSet.add(new Student("ȫ�浿", 3));
		hashSet.add(new Student("�̼���", 6));
		hashSet.add(new Student("�庸��", 1));
		
		System.out.println(hashSet.toString());
		
		Student student = new Student("�̼���", 6);
		//hashSet.remove(student);
		hashSet.add(student);
		hashSet.add(student);
		hashSet.add(student);
		hashSet.add(student);
		hashSet.add(student);
		
		System.out.println(hashSet.toString());
		
		HashSet<Student> hashSet2 = new HashSet<Student>();
		
		hashSet2.addAll(hashSet);
		
		System.out.println(hashSet2.toString());
		
		Iterator<Student> it = hashSet2.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
