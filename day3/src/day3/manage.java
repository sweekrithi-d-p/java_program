package day3;

public class manage implements operator {
	freelancer[] base=new freelancer[5];
	static int pos;public void insert(freelancer free)
	{
		for(int index=0;index<base.length;index++)
		{
			if(base[index]==null)
			{
				base[index]=free;
				System.out.println(free.getName()+"lancer added");break;
			}
		}
	}
	public void search(String tech)
	{
		if(pos>=base.length-1)
		{
			return;
		}
		else
		{
			if(base[pos].getSkill().equalsIgnoreCase(tech))
			{
				System.out.println(base[pos]);
			}
			pos++;
		}
		search(tech);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//freelancer free1=new freelancer();
		//free1.setName("swee");free1.setExp(2); free1.setSkill("software developer");free1.setId(5);
//System.out.println(free1);
		freelancer f=new freelancer("ss","java",7,7000);
		freelancer b=new freelancer("s","java",12,17000);
		freelancer t=new freelancer("sj","c",2,5000);
		freelancer m=new freelancer("ls","python",5,8000);
		manage man=new manage();
		man.insert(f);
		man.insert(b);
		man.insert(t);
		man.insert(m);
	pos=0;
	man.search("python"); 
	}
	}
	
	