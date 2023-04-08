package grooming;

import java.io.File;
import java.io.FileReader;

public class Read_Data_FileReader {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C://Users//Kartik//Documents//git hub credentials.txt");
		FileReader fr = new FileReader(f);
		
	    char[] arr = new char[ (int) f.length()];
      
	    fr.read(arr);
	    
	    System.out.println(new String(arr));
	}

}
