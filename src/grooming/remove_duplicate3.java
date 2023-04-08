package grooming;

public class remove_duplicate3 {

	public static void main(String[] args) {
		
		String s="karnataka";
		char[] arr=s.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='o';
				}
			}
		}
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]!='o')
			{
				System.out.print(arr[k]);
			}
		}
	}

}
