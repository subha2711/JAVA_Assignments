package assignment6;

public class ClassTwo {
	public static int a=5;
	int b=2;
	
	public ClassTwo(){		//default constructor
		this(4);
	}

	//parameterized constructor
	private	ClassTwo(int b) {
		this("Multiplication");		//using this keyword to call other constructot
		System.out.println("This is a private method , called in default constructor");
		this.b=b;
		int c=a*b;
		System.out.println("Multiplication of global variable "+a +b +" is "+c);
	}
	protected ClassTwo(String oper){
		this(a,2);
		
		
	}
	ClassTwo(int a, int b){
		System.out.println("Its a Addition Program");
		int sum= b+b+a;
		System.out.println("Addition for 3 variables "+a +"+"+b+"+"+b+" = "+sum);
	}
}
