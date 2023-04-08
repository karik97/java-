package grooming;
//prime number 1 to 100
public class prime_number
{
 public static void main(String[] args) {
	
	 for(int i=1; i<=100; i++)
	 {
		 
		 int count = 0;
		 int sum=0;
		 int no=i;
		 
		 for(int j=1; j<=no; j++)
		 {
			 if(no%j==0)
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 //System.out.println(no+" is a prime number");		 
			 
		 }
		 
		 else
		 {
			  //System.out.println(no+" its not a prime number");
		 }
		 sum=sum+no;
		 System.out.println(sum);
	 }
	 
	 
}
}
