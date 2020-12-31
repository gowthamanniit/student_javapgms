package Folder3_File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
class Stud implements Serializable
{
	int id;
	String name;
	int mark;
	Stud(int id,String name,int mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;		
	}	
}
public class SerailDeserial {
	public static void main(String[] args)throws Exception {
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student id:");
		int id=scan.nextInt();
		System.out.println("Enter Student Name:");
		String name=scan.next();
		System.out.println("Enter Mark:");
		int mark=scan.nextInt();
		
		Stud s1=new Stud(id,name,mark);
		
		// serialzation concept --> object to byteoutputstream
		File f=new File("e:/store.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);		
		oos.writeObject(s1);
		System.out.println("successfully stored bytestream");
		oos.flush(); // memory clear		
		scan.close();
		*/
		
		// deserialization
		File f=new File("e:/store.txt");
		FileInputStream  fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Stud s2=(Stud)ois.readObject();
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.mark);
		
		ois.close();
		fis.close();		
	}
}