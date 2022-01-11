package assignment7_part1;

import assignment7_part2.ClassBB;

public class ClassA extends ClassB {

	public static void main(String[] args) {
		ClassA a= new ClassA();
		a.Print();
		a.Print(a.a);
		a.Print(a.a, a.b);
		
		a.pro();
		a.pri();
		a.def();
		
		a.pubC();
		a.proC();
	//	a.privC(); private method in different class cannot be called even after extending
		a.defC();
		
		a.PubA();	//diff pack-public method
		//a.privA()	//diff pac- private method cannot be accessed
		a.proA(); 	//diff pac-protected method
	//	a.defA();	//dii pac-default method cannot be accessed
		
		ClassBB bb= new ClassBB();	//have to import the ClassBB
		bb.PubB(); 	//diff pak-non sub public method
	//	bb.proB();	//diff pak-non sub protected method cannot be accessed
	//	bb.priB();	//diff pak-non sub private method cannot be accessed
	//	bb.defB();	//diff pak-non sub default method cannot be accessed
		
		

	}

		public  void Print() {
			System.out.println("This is methodoverride. To use the method of the parent"
					+ " use the SUPER keyword.");
			super.Print();
		}
		protected void pro() {
			System.out.println("Class A protected method");
		}
		private void pri() {
			System.out.println("Class A private method");
		}
		void def() {
			System.out.println("Class A default  method");
		}
}
