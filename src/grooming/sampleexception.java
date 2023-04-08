package grooming;

public class sampleexception 
{
	public static void submit() throws sample 
	{
		int a=18;
		if(a>=21)
		{
			System.out.println("yes");
		}
		else
		{
			throw new sample("not valid");
		}
	}
	public static void main(String[] args) throws Exception
	{
		try
		{
			submit();
		}
		catch(sample e)
		{
			System.out.println(e.getmsg());
		}
	
    }
}
class sample extends Exception
{
	private String msg;
	sample(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}



