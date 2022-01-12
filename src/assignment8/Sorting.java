package assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer>rnum=new ArrayList<Integer>();
		Random  rn = new Random();
		
		while(rnum.size()!=500) {
			rnum.add(rn.nextInt((1000-100)+1)+100);
		}
		System.out.println("arry list is :"+ rnum);
	System.out.println("Smallest numer is "+ Collections.min(rnum));

	}

}
