package day3;

public class fourthinside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new merchant().gets();
new merchant().get(2);
	}

}
class merchant{
	int[] price= {12000,4500,23000,15000};
	public void get(int index)
	{
		System.out.println(price[index]);
	}
	public void gets()
	{
		for(int k:price)
		{
			System.out.println(k);
		}
	}
}
