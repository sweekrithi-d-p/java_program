package day1;

public class parsingsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(args.length);
int deposited=0,months;float intrest=0.0F;char type='\0';
deposited=Integer.parseInt(args[0]);
intrest=Float.parseFloat(args[2]);
months=Integer.parseInt(args[1]);
type=args[3].charAt(0);
deposited+=(deposited*(months*intrest))/100;
System.out.println("account details"+type+" "+intrest+" "+months+" "+deposited);

	}

}

