import java.util.*;
import java.io.*;
import Package.*;

class Create{
		private String FName;
		private String LName;
		private String MName;
		private long Ammount=0;
		private long AccountNumber;
		private String Address;
		private String BDate;
		private String Email;
		private String Gender;
		private String PhoneNumber;
		private String Password;
		private String RePassword;
		
		void create(){
			Methods m=new Methods();
			System.out.println("\n\t\t     ******************************* Create New Account ***********************************");
			Scanner s=new Scanner(System.in);
			Random r=new Random(); //For Create Random Number
			
			System.out.print("\t\t     Enter First Name : ");
			FName=s.next();
			
			System.out.print("\t\t     Enter Middle Name : ");
			MName=s.next();
			
			System.out.print("\t\t     Enter Last Name : ");
			LName=s.next();
			
			System.out.print("\t\t     Enter Your Address : ");
			Address=s.next();
			
			System.out.print("\t\t     Enter Your Birth Date : ");
			BDate=s.next();
			
			System.out.print("\t\t     Enter Your Email : ");
			Email=s.next();
			
			System.out.print("\t\t     Enter Your Gender : ");
			Gender=s.next();
			
			do{
				System.out.print("\t\t     Enter Your Phone Number : ");
				PhoneNumber=s.next();
				if(PhoneNumber.length()!=10)
					System.out.println("\t\t     Please,Enter Correct Phone Number...\n");
				if(m.check(PhoneNumber))
					System.out.println("\n\t\t     Please Enter New Number This Number Have Already Account.\n");
			}while(PhoneNumber.length()!=10 || m.check(PhoneNumber)); //Phone Number Should be 10 Digit and new Number
			
			do{
				System.out.print("\t\t     Enter Your Password : ");
				Password=s.next();
				System.out.print("\t\t     Enter Re-Password : ");
			    RePassword=s.next();
				if(!(Password.equals(RePassword)))
					System.out.println("\t\t     Re-Password Does Not Match With Password , Please Enter Same Re-Password...");
				System.out.println();
			}while(!(Password.equals(RePassword))); //Check Password And Re-Password Should be Same
			
			do{
				AccountNumber=r.nextInt(9999999);
				File f=new File(AccountNumber+".txt");
				if(!(f.exists()))
					break;
			}while(true); //Check File is Exists Or Not
			System.out.println("\t\t         +-----------------------------------------------------------------------+");
			System.out.println("\t\t         |     Your Account Has Been Generated.Your Account Number Is "+AccountNumber+"    |");
			System.out.println("\t\t         +-----------------------------------------------------------------------+");
			
			try{
				FileWriter f1=new FileWriter(AccountNumber+".txt",true);
				BufferedWriter buf=new BufferedWriter(f1);
				
				buf.write(AccountNumber+"");
				buf.newLine();
				
				buf.write(FName);
				buf.newLine();
				
				buf.write(MName);
				buf.newLine();
				
				buf.write(LName);
				buf.newLine();
				
				buf.write(Ammount+"");
				buf.newLine();
				
				buf.write(Address);
				buf.newLine();
				
				buf.write(BDate);
				buf.newLine();
				
				buf.write(Email);
				buf.newLine();
				
				buf.write(Gender);
				buf.newLine();
				
				buf.write(PhoneNumber);
				buf.newLine();
				
				buf.write(Password);
				buf.close();
				f1.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try{
				FileWriter f2=new FileWriter("PhoneNumber.txt",true);
				BufferedWriter buf1=new BufferedWriter(f2);
				buf1.write(PhoneNumber);
				buf1.close();
				f2.close();
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
		}
		
}

public class Home{
	
	public static int Delete(){
		Scanner s=new Scanner(System.in);
		Methods m=new Methods();
		
		String Password;
		String CheckPassword=null;
		
		System.out.print("\t\t     Enter Your Account Number : ");
	    long AccountNumber=s.nextLong();
		
		System.out.print("\t\t     Enter Password : ");
	    Password=s.next();
		
		File f1=new File(AccountNumber+".txt");
		if(f1.exists()){
			CheckPassword=m.GetDetails(AccountNumber,"Password");
			
			if(!(Password.equals(CheckPassword))){
				System.out.println("\t\t     Your Password Is Wrong.Please Enter Correct Password...");
				return 0;
			}
			m.remove(m.GetDetails(AccountNumber,"PhoneNumber"));
			if(f1.delete()){
				System.out.println();
				System.out.print("\t\t          +---------------------> MESSAGE <------------------------+\n");
				System.out.print("\t\t          |                                                        |\n");
				System.out.print("\t\t          |             Account is Successfully Deleted.           |\n");
				System.out.print("\t\t          +--------------------------------------------------------+\n");
			}
		}
		else{
			System.out.println();
			System.out.print("\t\t          +--------------> ERROR <---------------+\n");
			System.out.print("\t\t          |                                      |\n");
			System.out.print("\t\t          |          Account Not Found.          |\n");
			System.out.print("\t\t          +--------------------------------------+\n");
			return 0;
		}
		return 0;
	}
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Methods m=new Methods();
		Login l=new Login();
		User u=new User();
		Create c=new Create();
		System.out.println();
		System.out.println("\t\t     <------------------------------------------------------------------------------------>");
		m.wait(200);
		System.out.println("\t\t     <---------------------+----------------------------------+--------------------------->");
		m.wait(200);
		System.out.println("\t\t     <---------------------|    Welcome To E-Banking System   |--------------------------->");
		m.wait(200);
		System.out.println("\t\t     <---------------------+----------------------------------+--------------------------->");
		m.wait(200);
		System.out.println("\t\t     <------------------------------------------------------------------------------------>");
		m.wait(200);
		while(true){	
			System.out.println();
			System.out.println("\n\t\t     *********************************** Home Page ****************************************\n");
			System.out.println("\t\t     +------------------------------------------------------------------------------------+");
			System.out.println("\t\t     |                               1.Create New Account                                 |");
			System.out.println("\t\t     |                               2.Login in Account                                   |");
			System.out.println("\t\t     |                               3.Delete Account                                     |");
			System.out.println("\t\t     |                               4.Exit                                               |");
			System.out.println("\t\t     +------------------------------------------------------------------------------------+");
			System.out.println();
			System.out.print("\t\t     -> Enter Your Choice : ");
			int i=s.nextInt();
			switch(i)
			{
				case 1:
					c.create();
					break;
				case 2:
					long a=l.Login();
					if(a!=0)
						u.user(a);
					break;
				case 3:
					Delete();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("\t\t     Please, Enter Valid Number...");
			}
		}
	}
}