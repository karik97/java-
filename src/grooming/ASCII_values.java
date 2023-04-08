package grooming;
public class ASCII_values {	
	public static void main(String[] args){		
		for(int i=48; i<=58; i++)//numbers
		{
			System.out.println("ASCII values of "+(char)i+" "+i);
		}
		for(int j=97; j<=122; j++)//small letter
		{
			System.out.println("ASCII values of "+(char)j+" "+j);
		}
		for(int k=65; k<=90; k++)//capital
		{
			System.out.println("ASCII values of "+(char)k+" "+k);
		}
	}
}