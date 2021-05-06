package Package;
import java.util.*;
import java.io.*;

public class Methods{
	public void wait(int ms) //For Give Some Delay
	{
		try
		{
			Thread.sleep(ms);
		}
		catch(Exception ex) //InterruptedException
		{
			System.out.println(ex);
		}
	}
	
	public Boolean check(String a){
			File f=new File("PhoneNumber.txt");
			try{
				if(!(f.exists()))
					f.createNewFile();
				BufferedReader buf2=new BufferedReader(new FileReader("PhoneNumber.txt"));
				String b=buf2.readLine();
				while(b!= null){
					if(b.equals(a)){
						buf2.close();
						return true;
					}
					b=buf2.readLine();
				}
				buf2.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return false;
		}
	
	public String GetDetails(long a,String b){  //Get Details
		String Detail;
		try{
			BufferedReader buf=new BufferedReader(new FileReader(a+".txt"));
			Detail=buf.readLine();
			if(b.equals("AccountNumber")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("FName")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("MName")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("LName")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Ammount"))
			{
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Address")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Birth Date")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Email")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Gender")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("PhoneNumber")){
				buf.close();
				return Detail;
			}
			Detail=buf.readLine();
			if(b.equals("Password")){
				buf.close();
				return Detail;
			}
			buf.close();
			System.out.println("No Found :" + b);
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
	
	public void PutDetails(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k){  //Get Details
		try{
			BufferedWriter buf=new BufferedWriter(new FileWriter(a+".txt",false));
			buf.write(a+""); //AccountNumber
			buf.newLine();
				
			buf.write(b);  //First name
			buf.newLine();
				
			buf.write(c);  //Middle Name
			buf.newLine();
				
			buf.write(d);  //Last name
			buf.newLine();
				
			buf.write(e+""); //Ammount
			buf.newLine();
				
			buf.write(f);  //Address
			buf.newLine();
				
			buf.write(g);  //Birth Date
			buf.newLine();
				
			buf.write(h);  //Email
			buf.newLine();
			
			buf.write(i);  //Gender
			buf.newLine();
			
			buf.write(j);  //Phone Number
			buf.newLine();
			
			buf.write(k);  //Password
			buf.close();
		}catch(Exception ex){
			System.out.println(ex +"nn");
		}
	}
	
	public void remove(String Phone){
		try{
			BufferedWriter b1=new BufferedWriter(new FileWriter("PhoneNumber1.txt",false));
			BufferedReader b2=new BufferedReader(new FileReader("PhoneNumber.txt"));
			String b=b2.readLine();
			while(b!=null){
				if(b.equals(Phone)){
					b="";
					b1.write(b);
				}
				else{ 
					b1.write(b);
					b1.newLine();
				}
				b=b2.readLine();
			}
			b1.close();
			b2.close();
			BufferedWriter b3=new BufferedWriter(new FileWriter("PhoneNumber.txt",false));
			BufferedReader b4=new BufferedReader(new FileReader("PhoneNumber1.txt"));
			b=b4.readLine();
			while(b!=null){
				b3.write(b);
				b3.newLine();
				b=b4.readLine();
			}
			b3.close();
			b4.close();
			File ff=new File("PhoneNumber1.txt");
			ff.delete();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}