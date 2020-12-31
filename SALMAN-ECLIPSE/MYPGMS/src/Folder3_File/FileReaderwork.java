package Folder3_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderwork {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		/*
		File f=new File("E:/123.txt");
		FileReader fr=new FileReader(f);
	
		int len=(int)f.length();
		char a[]=new char[len];
		fr.read(a);
		
		for(char c:a)
		{
			System.out.print(c);
		}
		fr.close();
		*/
		FileWriter fw=new FileWriter("e:/xxx.txt",true);			
		fw.write("\nwelcome");
		fw.close();
	}

}
