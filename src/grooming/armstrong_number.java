package grooming;

public class armstrong_number {

	public static void main(String[] args) {
		int sum=0; 
		int num=155;
		int copy=num;
		while(num!=0)
		{
			int rem=num%10;
				sum=sum+(rem*rem*rem);
			    num=num/10;
		}
		if(sum==copy)
		{
			System.out.println(copy+" is a armstrong number");
		}
		else
		{
			System.out.println(copy+" is not a armstrong number");
		}

	}

}
