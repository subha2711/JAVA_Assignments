package assignment3;
import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		
		UserInput("welcome");
	}

	public static void UserInput(String val) {
		
String replace = val.replace('o', 'z');
		
		System.out.println("Uppercase = "+val.toUpperCase()+
				"\nSize is = "+val.length()+
				"\nReplace letter 'o' with 'z' = "+ val.replace('o', 'z')+
				"\nLast Character in the String = "+ replace.charAt(replace.length()-1)+
				"\nConcatenation of two Strings = "+"\""+val+" Test\"");
	}
}
