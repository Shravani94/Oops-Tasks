package cj4programs;

public class constructors {
	public String name;
	public String collegename;
	public String pancard;
	public constructors(String name,String collegename) {
		this.name=name;
		this.collegename=collegename;
	}
	
	public constructors(String name,String collegename,String pancard)//constructor overloading
	{
		this(name,collegename);//constructor chaining
		this.pancard=pancard;
	}
	public  void diplay()
	{
		System.out.println("student details");
		System.out.println("----------------");
		System.out.println("name :" +this.name);
		System.out.println("collegename:" +this.collegename);
		if(pancard!=null)
		{
			System.out.println("pancard:"+this.pancard);
			
		}
		else
		{
			System.out.println();
		}

			
		
	}
	public static void main(String[] agrs)
	{
		constructors c1=new constructors("Shravani","scit");
		c1.diplay();
		constructors c2=new constructors("Shravani","scie","edp3456a3");
		c2.diplay();
	}

}
