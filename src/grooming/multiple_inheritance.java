package grooming;

interface father
{
	void angry();
}
interface mother
{
	void strong();
}
class son implements father,mother
{
	public void angry()
	{
		System.out.println("angry");
	}
	public void strong()
	{
		System.out.println("strong");
	}
}
public class multiple_inheritance {

	public static void main(String[] args) {
		son s=new son();
		s.angry();
		s.strong();
	}

}
