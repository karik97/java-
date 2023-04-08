package grooming;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		
		
        int [] arr= {1,1,1,1,2,4,5};
        Map<Integer, Integer> m=new HashMap<Integer, Integer>();
        
        for(int a:arr)
        {
        	if(!m.containsKey(a))
        	{
        		m.put(a, 1);
        	}
        	else
        	{
        		int count=m.get(a);
        		m.put(a, count+1);
        	}	
        }
        for(Entry<Integer, Integer> o:m.entrySet())
    	{
    		System.out.println(o.getKey()+" "+o.getValue()+ "");
    	}
	}

}
