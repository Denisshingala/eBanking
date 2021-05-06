package Package;
import java.util.*;
import Package.*;
import java.io.*;

public class User{
	private static int Transaction(long a){
		Scanner s=new Scanner(System.in);
		Methods m=new Methods();
		while(true){
			System.out.println("\n\t\t     ************************************** Transaction ***********************************\n");
			System.out.println();
			System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
			System.out.println("\t\t     |                               1.Deposit                                             |");
			System.out.println("\t\t     |                               2.Withdraw                                            |");
			System.out.println("\t\t     |                               3.Exit                                                |");
			System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
			System.out.print("\t\t     Enter Your Choice : ");
			int x=s.nextInt();
			
			switch(x){
				case 1:
					System.out.print("\t\t     How Many Money will you deposite? : ");
					long b=s.nextLong();
					long c=Long.parseLong(m.GetDetails(a,"Ammount"));
					c=c+b;
					m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),String.valueOf(c),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
					System.out.println("\n\t\t     $ " + c + " Debited.\n");
					break;
				case 2:
					long w=Long.parseLong(m.GetDetails(a,"Ammount"));
					System.out.print("\t\t     How Many Money will you withdraw ? " + "You have a $ " + w + ". : " );
					do{
						b=s.nextLong();
						if(b > w){
							System.out.println();
							System.out.print("\t\t          +-----------------> ERROR <-----------------+\n");
							System.out.print("\t\t          |                                           |\n");
							System.out.print("\t\t          |             Insufficient Balance          |\n");
							System.out.print("\t\t          +-------------------------------------------+\n");
						}
					}while(b > w);
					w=w-b;
					m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),String.valueOf(w),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
					System.out.println("\n\t\t     $ " + w + " Debited.\n");
					break;
				case 3:
					System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
					return 0;
				default:
					System.out.println("\t\t     Please Enter Valid Number");
			}
		}
	}
	
	private static int Change(long a){
		Methods m=new Methods();
		Scanner s=new Scanner(System.in);
		System.out.println("\n\t\t     *********************************** Change Details ***********************************\n");
		System.out.println();
		System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
		System.out.println("\t\t     |                               1.Name                                                |");
		System.out.println("\t\t     |                               2.Address                                             |");
		System.out.println("\t\t     |                               3.Birth Date                                          |");
		System.out.println("\t\t     |                               4.Email                                               |");
		System.out.println("\t\t     |                               5.Gender                                              |");
		System.out.println("\t\t     |                               6.Phone Number                                        |");
		System.out.println("\t\t     |                               7.Password                                            |");
		System.out.println("\t\t     |                               8.Exit                                                |");
		System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
		System.out.print("\t\t     Enter Your Choice : ");
		int y=s.nextInt();
		switch(y){
			case 1:
				System.out.print("\t\t     Enter Your First name : ");
				String Fname=s.next();
				System.out.print("\t\t     Enter Your Middle name : ");
				String Mname=s.next();
				System.out.print("\t\t     Enter Your Last name : ");
				String Lname=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),Fname,Mname,Lname,m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
			    break;
			case 2:
				System.out.print("\t\t     Enter Your Address : ");
				String Address=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),Address,m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
				break;
			case 3:
				System.out.print("\t\t     Enter Your Birth Date : ");
				String Bdate=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),Bdate,m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
				break;
			case 4:
				System.out.print("\t\t     Enter Your Email : ");
				String Email=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),Email,m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
				break;
			case 5:
				System.out.print("\t\t     Enter Your Gender : ");
				String Gender=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),Gender,m.GetDetails(a,"PhoneNumber"),m.GetDetails(a,"Password"));
				break;
			case 6:
				String Phone; 
				do{
				System.out.print("\t\t     Enter Your Phone Number : ");
				Phone=s.next();
				if(Phone.length()!=10)
					System.out.println("\t\t     Please,Enter Correct Phone Number...\n");
				if(m.check(Phone))
					System.out.println("\n\t\t     Please Enter New Number This Number Have Already Account.\n");
				}while(Phone.length()!=10 || m.check(Phone));
				m.remove(m.GetDetails(a,"PhoneNumber"));
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),Phone,m.GetDetails(a,"Password"));
				try{
					FileWriter f2=new FileWriter("PhoneNumber.txt",true);
					BufferedWriter buf1=new BufferedWriter(f2);
					buf1.write(Phone);
					buf1.close();
					f2.close();
				}catch(Exception e){
					System.out.println(e);
				}
				break;
			case 7:
				System.out.print("\t\t     Enter Your New Password : ");
				String Password=s.next();
				m.PutDetails(m.GetDetails(a,"AccountNumber"),m.GetDetails(a,"FName"),m.GetDetails(a,"MName"),m.GetDetails(a,"LName"),m.GetDetails(a,"Ammount"),m.GetDetails(a,"Address"),m.GetDetails(a,"Birth Date"),m.GetDetails(a,"Email"),m.GetDetails(a,"Gender"),m.GetDetails(a,"PhoneNumber"),Password);
			case 8:
				return 0;
			default:
			    System.out.println("\t\t     Please,Enter valid Number");
		}
		System.out.println();
		System.out.print("\t\t          +--------------> SuccessFully <--------------+\n");
		System.out.print("\t\t          |                                            |\n");
		System.out.print("\t\t          |            Your Data Has Changed.          |\n");
		System.out.print("\t\t          +--------------------------------------------+\n");
		System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
		return 0;
	}
	
	public void Display(long a){
		Methods m=new Methods();
		System.out.println("\n\t\t     *************************************** Display **************************************\n");
		System.out.println();
		System.out.println("\n\t\t     1. Account Number : " + m.GetDetails(a,"AccountNumber"));
		System.out.println("\n\t\t     2. Account Holder Number : " + m.GetDetails(a,"LName") + " " + m.GetDetails(a,"FName") + " " + m.GetDetails(a,"MName"));
		System.out.println("\n\t\t     3. Account Balance : " + m.GetDetails(a,"Ammount"));
		System.out.println("\n\t\t     4. Address : " + m.GetDetails(a,"Address"));
		System.out.println("\n\t\t     5. Birth Date : " + m.GetDetails(a,"Birth Date"));
		System.out.println("\n\t\t     6. Email Id : " + m.GetDetails(a,"Email"));
		System.out.println("\n\t\t     7. Gender : " + m.GetDetails(a,"Gender"));
		System.out.println("\n\t\t     8. Phone Number : " + m.GetDetails(a,"PhoneNumber"));
		System.out.println();
		System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
	}
	
	public int user(long AccountNumber){
		int a;
		Methods m=new Methods();
		String name="Welcome To "+ m.GetDetails(AccountNumber,"LName") + " " + m.GetDetails(AccountNumber,"FName") + " "  + m.GetDetails(AccountNumber,"MName");
		Scanner s=new Scanner(System.in);
		System.out.print("\t\t     ");
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i));
			m.wait(100);
		}
		System.out.println();
		while(true){
			System.out.println("\n\t\t     ************************************** User Page *************************************\n");
			System.out.println();
			System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
			System.out.println("\t\t     |                               1.Transaction                                         |");
			System.out.println("\t\t     |                               2.Change Any Detail                                   |");
			System.out.println("\t\t     |                               3.View Account Information                            |");
			System.out.println("\t\t     |                               4.Logout                                              |");
			System.out.println("\t\t     +-------------------------------------------------------------------------------------+");
			System.out.print("\t\t     Enter Your Choice : ");
			a=s.nextInt();
			switch(a){
				case 1:
					Transaction(AccountNumber);
					break;
				case 2:
					Change(AccountNumber);
					break;
				case 3:
					Display(AccountNumber);
					break;
				case 4:
					System.out.println("\n\t\t     --------------------------------------------------------------------------------------\n");
					return 0;
				default:
					System.out.println("\t\t     Please,Enter valid Number");
			}
		}
	}
}