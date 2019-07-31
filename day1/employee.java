package day1;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String name, compname;
int experence;
float salary,cl,pl;
System.out.println(args.length);
experence=Integer.parseInt(args[2]);
salary=Float.parseFloat(args[3]);
name=(args[0]);
compname=(args[1]);
cl=(float)((1/3)*salary);
pl=(float)((1/4)*salary);
if(experence >=4&&experence<=8)
{
	System.out.println("the employee is project manager");

}
if(experence >=2&&experence<=3)
{
	System.out.println("the employee is teamlead");
}
	}
	

}
