class Telusko
{
	private String course;
	
	private Double price;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
public class LaunchEncap6 
{
	public static void main(String[] args)
	{
		
		Telusko t1=new Telusko();
		t1.setCourse("DevOps with AWS");
		t1.setPrice(6500.5);
		
		System.out.println(t1.getCourse());
		System.out.println(t1.getPrice());
	}

}
