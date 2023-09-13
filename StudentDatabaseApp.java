package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[]args) {
		//ask how many new students we want to add
		System.out.println("Enter no of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		Student[] stu =new Student[numOfStudents];
		//create n number of new students
		for(int n=0; n<numOfStudents; n++) {
			stu[n] = new Student();
			stu[n].enroll();
			stu[n].payTuition();
		}
		for(int n=0; n < numOfStudents; n++) {
			System.out.print(stu[n].toString());
		}
	}

}
