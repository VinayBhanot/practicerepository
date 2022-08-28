package ReadWriteFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadInRange {
	
	public void ReadDataOfRange(int a, int b) throws IOException {
		File f = new File("../Project1/Session2.txt");
		  FileReader fr = new FileReader(f);
		  BufferedReader br = new BufferedReader(fr);
		  int num = 0;
		  String s;
		  while ((s=br.readLine())!=null)
		  {
			  num = num+1;
			  if(num>=a&&num<=b)
			  {
				  System.out.println(s);
			  }
		  }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadInRange rd = new ReadInRange();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the start row");
		int start = obj.nextInt();
		System.out.println("Enter the last row");
		int end = obj.nextInt();
		rd.ReadDataOfRange(start, end);
		

	}

}
 