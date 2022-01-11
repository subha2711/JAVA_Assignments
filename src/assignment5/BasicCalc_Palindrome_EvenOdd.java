package assignment5;

import java.util.Scanner;

public class BasicCalc_Palindrome_EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("****************Basic Calculator********************");
		BasicCalc(10,5);
		System.out.println("****************Even and Odd********************");
		EvenOdd(11);
		System.out.println("****************Palindrome********************");
		Palindrome("daddy");
	}
	
	public static void BasicCalc(int a, int b) {
		System.out.println("Enter the choice of operation you want to do(choose number) : "+
							"\n1--ADD"+
							"\n2--SUB"+
							"\n3--MULTI"+
							"\n4--DIV");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		switch(num) {
		case 1:
			System.out.println("Addition of "+a + " and "+ b+" is:"+ (a+b));
			break;
		case 2:
			if(a>b)
			System.out.println("Subtraction of "+a + " and "+ b+" is:"+ (a-b));
			else
				System.out.println("Subtraction of "+a + " and "+ b+" is:"+ (b-a));
			break;
		case 3:
			System.out.println("Multiplication of "+a + " and "+ b+" is:"+ (a*b));
			break;
		case 4:
			System.out.println("Division of "+a + " and "+ b+" is:"+ (a/b));
			break;
			default:
				System.out.println("You have selected invalid operation.\nEnd of program");
		}
		}
	
	public static void EvenOdd(int n) {
	if(n%2==0)
		System.out.println("The given number "+ n + " is EVEN");
	else
		System.out.println("The given number "+ n + " is ODD");
	}
	
	public static void Palindrome(String original) {
		int length =original.length();
		int index= length-1;
		String concat ="";
			for(int i=index;i>=0;i--) {
		
				concat= concat+original.charAt(i);
			}
		if(original.equalsIgnoreCase(concat)) 
			System.out.println("Given String "+ original + " is PALINDROME.");
		else
			System.out.println("Given String "+ original + " is NOT-PALINDROME.");
	}
}
