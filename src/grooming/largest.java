package grooming;

public class largest {

	public static void main(String[] args) {		
		int arr[]= {1,4,8,2,3,7};
		int large=arr[0];
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]>large)
        	{
        		large=arr[i];
        	}
        }System.out.println(large);
	}

}
