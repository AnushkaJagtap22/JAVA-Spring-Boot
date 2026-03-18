class Demo
{
	static int a ,b; //1
	
	int x ,y;

	static  // 2
	{
		System.out.println("Static init block");
	}
	
	{
		System.out.println("Java init block(non static)");
	}
	
	Demo()
	{
		System.out.println("Constructor");
	}
	static void disp()
	{
		System.out.println("disp static method");
	}
	
	void show()
	{
		System.out.println("non static show method");
	}
}
public class LaunchStatic
{
	
	static
	{
		System.out.println("static block main");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		
		Demo d=new Demo();
	}
}
