package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costofCourse = 600;
	private static int id = 1000;
	
	
	//constructor prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastname = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - 2nd year\n3 - juinior\n4 - senior\nEnter student class level:\n ");
		this.gradeyear = in.nextInt();
		
		setStudentID();
		
		
	}
	//generate an ID
	private void setStudentID() {
		//grade level + id
		id++;
		this.studentID = gradeyear + " "+ id;
	}
	//Enroll in course
	 public void enroll() {
		 //get inside a loop
		 do {
			 System.out.println("Enter course to enroll (Q to quit): ");
			 Scanner in=new Scanner(System.in);
			 String course = in.nextLine();
			 if(!course.equals("Q") ) {
				 courses = courses + "\n " +course;
				 tuitionBalance = tuitionBalance + costofCourse;
			 }
			 else {
				 break;
			 }
		 }while(1!=0);
	 }
	//view balance
	 public void viewBalance() {
		 System.out.println("Your balance is :$"+tuitionBalance);
		 
	 }
	//pay tuition
	 public void payTuition() {
		 viewBalance();
		 System.out.println("Enter your payment : $");
		 Scanner in = new Scanner (System.in);
		 int payment = in.nextInt();
		 tuitionBalance= tuitionBalance - payment;
		 System.out.println("Thank you for your payment : $"+payment);
		 viewBalance();
	 }
	//show status
	 public String toString() {
		 return "Name: "+firstname+ " "+lastname +
				 "\nGrade Level: " +gradeyear+
				 "\nStudent ID: "+studentID +
				 "\nBalance: $"+ tuitionBalance;
	 }
	

}
