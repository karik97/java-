package grooming;

class l
{
	void noise()
	{
		System.out.println("hi");
	}
}
 class t extends l
{
	void noise()
	{
		System.out.println("meow");
	}
	
}
 class g extends l
{
	void noise()
	{
		System.out.println("bow");
	}
}
 class e extends l
{
	void noise()
	{
		System.out.println("bus");
	}
}
 class stim
{
	static void ansim(l a)
	{
		a.noise();
	}
}
public class runtime_poly{

	public static void main(String[] args) 
	{
		g d=new g();
		t c=new t();
		e s=new e();
		stim.ansim(s);
		stim.ansim(c);
		stim.ansim(d);		
	}

}
