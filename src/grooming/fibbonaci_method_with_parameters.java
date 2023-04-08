package grooming;

public class fibbonaci_method_with_parameters {

	public static int fib3;
	static void disp(int fib1,int fib2)
	{
		System.out.print(fib1+" "+fib2);
	  for(int i=0; i<12; i++)
	  {
		  fib3=fib1+fib2;
		  fib1=fib2;
		  fib2=fib3;
		  System.out.print(fib3+" ");
	  }
	}
	public static void main(String[] args) {
		
        disp(0,1);
	}

}