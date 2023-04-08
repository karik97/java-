package grooming;

public class remove_duplicate1 {

	public static void main(String[] args) {
		String d="I am am from i testYantra";
		String arr[]=d.split(" ");
		for(int i=0; i<arr.length; i++)//outer for loop
		{
			for(int j=i+1; j<arr.length; j++)//inner for loop
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="ohh yess";
				}
			}
		}		
		for(int k=0; k<arr.length; k++)
		{
			if(arr[k]!="ohh yess")
			{
				System.out.print(arr[k]+" ");
			}
		}
	}

}