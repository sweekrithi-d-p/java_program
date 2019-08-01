package day3;

public class secondinside {
String product;
float monitorsize;
class enquiry
{
	int price;
	public void show()
	{
		System.out.println(product+" "+monitorsize+" "+price);
		
	}
	public void greeting()
	{
		System.out.println(product+"are going to display");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondinside first=new secondinside();
		first.product="sony";
		first.monitorsize=20;
		enquiry enq=first.new enquiry();
		enq.price=60000;
		enq.greeting();
		enq.show();
		
		
		

	}

}
