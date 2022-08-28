package ReadWriteFiles;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataPassRowNo {
	
     public void ReadData(int lineno) throws IOException {
	  File f = new File("../Project1/Session2.txt");
	  FileReader fr = new FileReader(f);
	  BufferedReader br = new BufferedReader(fr);
	  int a = 0;
	  String s;
	  while ((s=br.readLine())!=null)
	  {
		  a = a+1;
		  if(a==lineno)
		  {
			  System.out.println(s);
			  break;
		  }
		  
	  }
	  }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         ReadDataPassRowNo row = new ReadDataPassRowNo();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the line no.");
         int lineno = sc.nextInt();
         row.ReadData(lineno);
	}

}
