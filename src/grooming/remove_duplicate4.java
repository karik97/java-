package grooming;

public class remove_duplicate4 {

	public static void main(String[] args) {
		
		int [] arr= {1,2,4,1,2,3,4,2,1,3};
		for(int i=0; i<arr.length; i++)
		{
			for(int k=i+1; k<arr.length; k++)
			{
				if(arr[i]==arr[k])
				{
					arr[k]=0;
				}
			}
		}
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]!=0)
			{
				System.out.println(arr[j]);
			}
		}
	}

}
