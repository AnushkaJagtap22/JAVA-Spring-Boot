//non static block or java init block 

class Car
{
	private String brand;
	private double cost;
	
	static int count;//0--> 1 --> 2  --> 3
	// 99
	//97 count++  forgot to write count ++ in 3 constructor
	
	{
		count++;
	}
	
	
	Car()
	{
		
	}
	
	Car(String brand, double cost)
	{
		this.brand=brand;
		this.cost=cost;
		
	}
	
	Car(String brand)
	{
		this.brand=brand;
		
	}
	
}
public class LaunchJavaBlock
{
	public static void main(String[] args)
	{
		//WAP to count number of object created
		Car c1=new Car();
		System.out.println(Car.count); //1
		
		Car c2=new Car("BMW");
		System.out.println(Car.count);//2
		
		Car c3=new Car("BENZ");
		System.out.println(Car.count);//3
				
				Car c4=new Car();
		System.out.println(Car.count);//4
	}

}
