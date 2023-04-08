package grooming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteData_BufferWriter {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C://Users//Kartik//Documents//.txt" );
		
		FileWriter fw = new FileWriter(f,true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("jhjn");
		bw.newLine();
		bw.write("mnm");
		bw.newLine();
		bw.append("klkjj");
		bw.flush();
		bw.close();
	}

}
