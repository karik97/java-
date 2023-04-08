package grooming;

public class fact_method_with_parameter {

	static int factorial()
	{
		int no=7;
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;		
	    }
		return fact;

	}
	public static void main(String[] args) {
	
		System.out.println(factorial());
		
	}
}
