package grooming;

interface animal
{
	void noise();
}
class dog implements animal
{
	public void noise()
	{
		System.out.println("bow bow");
	}
}
class cat implements animal
{
	public void noise()
	{
		System.out.println("meow meow");
	}
}
class snake implements animal
{
	public void noise()
	{
		System.out.println("buss buss");
	}
}
class stimulator
{
	static void ansim(animal a)
	{
		a.noise();
	}
}
public class abstraction {

	public static void main(String[] args) {
		dog d=new dog();
		cat c=new cat();
		snake s=new snake();
		stimulator.ansim(d);
		stimulator.ansim(s);
		stimulator.ansim(c);
			
	}

}
