package grooming;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_Filewriter {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C://Users//Kartik//Documents//git hub credentials.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("i");//this old data will overriden with bellow new data
		fw.write(",nbnj");//old data will be overidden with new data 
		fw.flush();
	}

}
