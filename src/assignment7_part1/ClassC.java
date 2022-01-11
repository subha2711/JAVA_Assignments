package assignment7_part1;

import assignment7_part2.ClassAA;

public class ClassC extends ClassAA{
	
	public  void pubC() {
		System.out.println("Class c public method");
	}
	protected void proC() {
		System.out.println("Class c protected method");
	}
	private void priC() {
		System.out.println("Class c private method");
	}
	void defC() {
		System.out.println("Class c default  method");
	}

}
