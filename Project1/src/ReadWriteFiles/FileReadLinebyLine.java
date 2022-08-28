package ReadWriteFiles;
//Read line by line
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadLinebyLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f1 = new File("../Project1/Session1.txt");
       FileReader fr = new FileReader(f1);
       BufferedReader read = new BufferedReader(fr);
       String s;
       while((s = read.readLine())!=null)
       {
    	   System.out.println(s);
       }
	}

}
