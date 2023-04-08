package grooming;

public class stroong_number {

	public static void main(String[] args) {
		int sum=0;
		int num=155;
		int copy=num;
		while(num!=0)
		{
			int rem=num%10;
			System.out.println();
			int fact=1;
			for(int i=rem; i>=1; i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
		}
		if(sum==copy)
		{
			System.out.println(sum+" is a strong mnumber");
		}
		else
		{
			System.out.println(sum+" is not a strong number");
		}
	}
}
