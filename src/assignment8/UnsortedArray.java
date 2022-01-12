package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UnsortedArray {

	public static void main(String[] args) {
		
		Set<Integer> num= new TreeSet<Integer>();
		Random rn =new Random();
		int i=0,j=i+1;
		
		
		for( i=0;i<=10;i++) {
			num.add(rn.nextInt((100-50)+1)+50);
			System.out.println(num);
		}	
		


	}
}
