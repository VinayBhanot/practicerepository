package ReadWriteFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f = new File ("../Project1/Session1.txt");
       FileWriter fw = new FileWriter(f, true);
       BufferedWriter wr = new BufferedWriter(fw);
       wr.newLine();
       wr.write("Hello Vinu");
       wr.newLine();
       wr.write("Welcome, session starts now");
       wr.close();
	}

}
