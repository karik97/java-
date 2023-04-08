package grooming;

public class bubble_sort {

	public static void main(String[] args) {
	
		int [] arr= {5,2,6,4,1,3};
		for(int i=0; i<arr.length; i++)
		{System.out.println(arr[i]);
			for(int j=i+1; j<arr.length; j++)
			{System.out.println(arr[j]);
				if(arr[i]>arr[j])//in order to get descending make < than
				{
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				//  System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
				//  System.out.println(arr[i]);
				}
			}System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		}
		
		for(int k=0; k<arr.length; k++)
		{
			//System.out.print(arr[k]+" ");
		}

	}

}
