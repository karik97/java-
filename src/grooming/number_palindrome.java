package grooming;

public class number_palindrome {

	public static void main(String[] args) {
		
		int no=55;
		int rev=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=rem+(sum%10);
			no=no/10;
		}System.out.println(sum);
		if(sum==rev)
		{
			System.out.println(rev);
		}else {
			System.out.println(rev +" is not palindrome");
		}
	}

}
