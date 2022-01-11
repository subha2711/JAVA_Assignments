package assignment6;

public class classOne {

	public static void main(String[] args) {
		//invoking constructor
		ClassTwo cons = new ClassTwo();
		System.out.println("********Access Modifier***********");
		accessModifiers();

	}

	
	public static void accessModifiers() {
		System.out.println("A AccessModifier defines who and how a class can be accessed. There are four Access Modifiers.They are \npublic\nprivate\npropected\ndefault");
		System.out.println();
		System.out.println("Public: Its a type of specifier, which when declared with a class or"
				+ "\n a method can be accessed by anyone innside or outside of different class and package."
				+ "\n It can be extented to different class in same package or different package.");
		System.out.println("\nPrivate: Its a type of specifier, which when declared with a class, then it cannot be accesse."
				+ "\n When declared it with a method, it cannot be access outside of the class, and thus"
				+ "\ncannot be accessed outside of same or different class . And also it cannot be extended.");
		System.out.println("\nProtected: Its a type of specifier when declared with  a class and is extended"
				+ "\n then it can be accessd but when its in different package-non-sub-class the class or the methods cannot be accessed");
		System.out.println("\nDefault: Its a specifier when declared with a class and mthod and when it extends to "
				+ "\n other class in same packages then subclasses are accessible. But if its not a subclass then it can not be accessed.");
	}
}
