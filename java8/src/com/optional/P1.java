package com.optional;

import java.util.Optional;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Student s=new Student();
		int id;
		System.out.println("Enter the student id and get the student name");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
	Optional<String> studentName=	s.getStudentNameByID(id);
	//System.out.println(StudentName);
	/*if(studentName!=null) {
		
	
	String  data=studentName.toUpperCase()+" Hello";
	System.out.println(data);
	}
	else {
		System.out.println("invalid id");
	}*/
	if(studentName.isPresent()) {
		//System.out.println(studentName);
		String data=studentName.get();
		System.out.println(data.toUpperCase()+"Hello");
		
	}
	else {
		System.out.println("Invalid ID");
	}
	}

}
