package grooming;

public class remove_duplicate2 {

	public static void main(String[] args) {

		int arr[]= {1,1,1,1};
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
			      arr[j]=0;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]!=0)
			{
				System.out.print(arr[k]);
			}
		}
	}
}
