package grooming;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.FileHandler;

class simple 
{
	public static void main(String[] args) {
		int[]arr= {1,1,5,8,7,9,6,2,6,8,7,9};

		int[] minArr = new int[3]; // assume the first three elements are the minimum
	    minArr[0] = arr[0];
	    if (arr.length > 1) {
	        minArr[1] = arr[1];
	        if (arr.length > 2) {
	            minArr[2] = arr[2];
	        }
	    }

	    // iterate through the array and update the minimum array if a smaller element is found
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < minArr[0]) {
	            minArr[2] = minArr[1];
	            minArr[1] = minArr[0];
	            minArr[0] = arr[i];
	        } else if (arr[i] < minArr[1]) {
	            minArr[2] = minArr[1];
	            minArr[1] = arr[i];
	        } else if (arr[i] < minArr[2]) {
	            minArr[2] = arr[i];
	        }
	        
	     System.out.println(minArr[2]);
	}}}
