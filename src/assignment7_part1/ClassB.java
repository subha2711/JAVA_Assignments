package assignment7_part1;

public class ClassB extends ClassC {

		int a= 5;
		String b= "hello";
		
		public  void Print() {
			System.out.println("Hello welcome to Java Class");
		}
		private  void Print(String b) {
			b=this.b;
			System.out.println(b+" This is method overloading");
		}
		protected void Print(int a) {
			System.out.println("This is a protected method and I am calling a private method inside this method");
			ClassB b= new ClassB();
			b.Print("Private Method");
		}
		void Print(int a,String b){
			System.out.println("This is a default method takes an int "+this.a+" and string "+this.b+"as arguments");
		}
}
