package grooming;

public class palindrome {

	public static void main(String[] args) {
			
		int num=145;
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}		
         if(sum==copy)
         {
        	 System.out.println(copy+" is palidrome");
         }
         else
         {
        	 System.out.println(copy+" is not a palinbdrome");
         }
	}
}
