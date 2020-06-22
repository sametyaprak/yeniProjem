package okulprojem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {	
			static List <String>  student = new ArrayList<> ();
			static List <String>  teacher = new ArrayList<> ();
			static List <String>  boss = new ArrayList<> ();		
	public static void searchFor () {
		System.out.println("for entering data..(1) for teacher");
		System.out.println("for entering data..(2) for student");
		System.out.println("for entering data..(3) for boss");
		Scanner scan = new Scanner (System.in);
		int data = scan.nextInt();
			switch (data) {
				case (1) : teacherDataCheck ();
					break;
				case (2) : sutudentDataCheck ();
					break;
				case (3) : bossDataCheck ();
					break;	
				}
	}					
		public static void teacherDataCheck () {
		teacherData ();	
		System.out.println("teacher methoduna ulastik");
		System.out.println("enter your teacher name");
		Scanner scan = new Scanner (System.in);
		String teacherName = scan.nextLine();
		if (!(student.contains(teacherName))) {
			System.out.println("==wrong data==");
			System.exit(0);
			}	else {
				//
			}
		}	
		public static void teacherData () {			
			teacher.add("teacher1");
			teacher.add("teacher2");
			teacher.add("teacher3");
			teacher.add("teacher4");	
			
		}		
		public static void sutudentDataCheck () {
			StudentData ();
			System.out.println("studentData methoduna ulastik");
			System.out.println("enter your student name");
			Scanner scan = new Scanner (System.in);
			String StudentName = scan.nextLine();			
			if (!(student.contains(StudentName))) {
				System.out.println("==wrong data==");
				System.exit(0);
			}}
		public  static void StudentData () {			
			student.add("student1");
			student.add("student2");
			student.add("student3");
			student.add("student4");				
		}
		public static void bossDataCheck () {
			System.out.println("bossData methoduna ulastik");
			System.out.println("enter your student name");
			Scanner scan = new Scanner (System.in);
			String boosName = scan.nextLine();
			if  (!(boss.contains(boosName))) {
				System.out.println("==wrong data==");
				System.exit(0);
			}
		}		
		public static void bossData () {			
			boss.add("boss1");
			boss.add("boss2");
			boss.add("boss3");
			boss.add("boss4");		
		}
		
		
		
}
