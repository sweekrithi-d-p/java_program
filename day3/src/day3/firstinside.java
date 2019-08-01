package day3;

public class firstinside {
	String org;
	double pack;
	static int count;
	public String toString()
	{
		return org+" "+pack+" "+count+"\n";
	}
	static class Magno
	{
   String tech;
		public void detail()
		{
			System.out.println(tech);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstinside first= new firstinside();
		first.org="infosys";
		first.pack=3.8;
		first.count=30;
		firstinside second= new firstinside();
		second.org="tcs";
		second.pack=6.8;
	    second.count=12;
	    System.out.println(first+"\n"+second);
	    firstinside.Magno mag = new firstinside.Magno();
	    mag.tech="spring";
	    mag.detail();
	    
	}

}
