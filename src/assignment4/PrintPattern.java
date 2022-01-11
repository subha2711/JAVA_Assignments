package assignment4;

public class PrintPattern {

	public static void main(String[] args) {
		/*
		 * Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20… 
		 * Given N ---
		 * Print backward to 0. (Ask user for a number and let's assume N is 5 so if the
		 * user input 5 – then the program should print: 5 4 3 2 1 0)
		 * 
		 * Ask the user for a word and then print each character out one by one.
		 * Example: user enters: hello; your program will print out: h e l l o
		 */
		System.out.print("Pattern is: ");
		 Pattern(20);
		
		System.out.print("\nReverse order from the given number :");
		ReverseOrder(10);
		
		System.out.print("\nCharacter array: ");
		CharVal("Hello");		

	}
	public static void Pattern(int n ) {
		for(int i=1; i<=n; i=i+4) {
			System.out.print(" "+i);
			if(i==1)
				i--;			
		}
	}
	public static void ReverseOrder(int n) {
			for(int i=n;i>=0;i--)
				System.out.print(" "+i);
	}

	public static void CharVal(String val) {
	
		char[] eachChar = val.toCharArray();
			for(char c : eachChar) {
				System.out.print(c+" ");
		}
	}
}
