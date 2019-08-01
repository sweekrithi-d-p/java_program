package day3;

public class consts extends brilliant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consts con=new consts();
		con.spring();
		con.hibernate();
		

	}
	public void spring()
	{
		super.spring();
	}
	

}

class brilliant
{
	// final class can in instantiated bt cannot be extended
	public void spring()
	{
		System.out.println("basic web application");
		
	}
	final public void hibernate()
	{
		System.out.println("ORM model");
	}
	final private class Android
	{
	public void skill()
	{
		System.out.println("java and xml");
	}
}
}