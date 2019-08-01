package day3;

public class thirdinside {
	int suit=42;
	public void root(long temp)
	{
		
		long accno=temp;
		class react
		{
			public void display()
			{
				System.out.println(thirdinside.this.suit);
			}
			
		}
		System.out.println(accno);
		react re=new react();
		re.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thirdinside third=new thirdinside();
		third.root(678954335789l);

	}

}
