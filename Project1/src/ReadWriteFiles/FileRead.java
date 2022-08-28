package ReadWriteFiles;
//read data character by character
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead 
{
	public static void main(String[] args) throws IOException {
		File f1 = new File("../Project1/Session1.txt");
		FileReader read = new FileReader(f1);
		int a;
		while ((a=read.read())!=-1)
		{
			System.out.println((char) a);
		}
	}

}
