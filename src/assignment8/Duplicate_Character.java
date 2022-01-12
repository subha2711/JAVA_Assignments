package assignment8;

import java.util.Scanner;

public class Duplicate_Character {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a String:");
		String val = str.nextLine();    
        int count;    
            
        //Converts given string into character array    
        char string[] = val.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    

	}
	}
}
