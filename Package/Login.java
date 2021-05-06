package Package;
import java.util.*;
import java.io.*;

public class Login{
	public long Login() {
		String Password;
		String CheckPassword=null;
		Scanner s=new Scanner(System.in);
		Methods m=new Methods();
		System.out.println("\n\t\t     ************************************** Login Page ************************************\n");
		
		System.out.print("\t\t     Enter Your Account Number : ");
		long AccountNumber=s.nextInt();
		
		System.out.print("\t\t     Enter Password : ");
	    Password=s.next();
		try{
			File f1=new File(AccountNumber+".txt");
			
			if((f1.exists())){
				CheckPassword=m.GetDetails(AccountNumber,"Password");
				
				if(!(Password.equals(CheckPassword))){
					System.out.println("\t\t     Your Password Is Wrong.Please Enter Correct Password...");
					return 0;
				}
			}
			else{
				System.out.println();
				System.out.print("\t\t          +---------------------------------> ERROR <----------------------------------+\n");
				System.out.print("\t\t          |                                                                            |\n");
				System.out.print("\t\t          |             Account Has Not been Found. Please Create New Account          |\n");
				System.out.print("\t\t          +----------------------------------------------------------------------------+\n");
				return 0;
			}
			System.out.println("\t\t     You are SuccessFully Login...");
			System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return AccountNumber;
	}
}
