package FOLDER2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class UtilityPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1=new Date();
		//Locale l1=new Locale("en","IN");
		//Locale l1=new Locale("en","US");
		Locale l1=new Locale("fr","FR");		
		
		System.out.println("date :"+d1);
		
		//======== only date ================
		//DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,l1);
		System.out.println(df.format(d1));
		//========== only time ==============
		//DateFormat tf=DateFormat.getTimeInstance(DateFormat.FULL);
		DateFormat tf=DateFormat.getTimeInstance(DateFormat.SHORT,l1);
		System.out.println(tf.format(d1));
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(l1);
		System.out.println("currency : "+nf.format(1234567.45));
		
	}

}
