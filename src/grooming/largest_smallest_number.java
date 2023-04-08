package grooming;

public class largest_smallest_number {

	static int [] arr={1,2,3,4,5,8,9,10};
	static void disp()
	{
		int large=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.print(large+" ");
	}
	static void demo()
	{
		int small=arr[0];
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]<small)
			{
				small=arr[k];
			}
		}
		System.out.print(small+" ");
	}
	public static void main(String[] args) {		
		disp();
		demo();
	
		
	}

}
