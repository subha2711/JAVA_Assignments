package assignment2;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);	//for non-primitive datatype
		Scanner num = new Scanner(System.in);	//for primitive datatype

		
	
	System.out.println("What is your name:");
	String name =str.nextLine();
	
	System.out.println("How old are you?");
	int age =num.nextInt();
	
	System.out.println("What is your gender?");
	String gender =str.nextLine();
	
	System.out.println("Where are you from?");
	String fromPlace =str.nextLine();
	
	System.out.println("Where do you live now?");
	String currPlace =str.nextLine();
	
	System.out.println("Where do you work?");
	String work =str.nextLine();
	
	System.out.println("What is your job role?");
	String jobRole =str.nextLine();
	
	System.out.println("What is your salary?");
	int sal =num.nextInt();
	
	System.out.println("How much raise are you getting next year?");
	int raise =num.nextInt();
	
	int totalSalary =sal+raise;
	
	System.out.println("My name is " + name + ". I am "+ age +" years old, " +gender +"."+
			 "\nI work at "+work+" as " +jobRole+"."+"\nI currently live in " +currPlace+
			". I am originally from "+ fromPlace+". I make "+sal+" dollar. "
			+ "\nI will get "+raise+" as annual raise so my total salary would be "+ totalSalary+" dollar next year.");
	
	}

}
