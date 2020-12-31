package Folder3_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//File f=new File("e:/salman1");
		Scanner scan=new Scanner(System.in);
		
		File f=new File("e:/updatedata.txt");
		
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("Enter text:");
		String text=scan.nextLine();
				
		byte b[]=new byte[text.length()];
		b=text.getBytes();
		fos.write(b);	
		
		System.out.println("Successfully Stored to file");
		fos.close();
		scan.close();	
		
		try
		{
		FileInputStream fis=new FileInputStream(f);
		int len=fis.available();
		System.out.println("total letter :"+len);
		int i=0;
		while(i<len)
		{
			System.out.print((char)fis.read());
			i++;
		}		
		fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}		
		
		/*
		if(f.exists())
		{
			
			if(f.isDirectory())
			{			
			System.out.println("this is directory"+f.getAbsolutePath());
			}	
			if(f.isFile())
			{
			System.out.println("this File is Exists "+f.getAbsolutePath());
			System.out.println("can read  :"+f.canRead());
			System.out.println("can write :"+f.canWrite());
			
			}
		}
		else
		{
			System.out.println("File/folder Not Available: "+f.getAbsolutePath());
		}
	*/
	}

}
