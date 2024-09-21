package BankMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login 
{
	 
	public Login(Scanner scanner,  ArrayList<Account> accounts) 
	{
		 System.out.println("Enter passcode:");
		 int passcode = scanner.nextInt();
		 Account account = new Account();
		  boolean exist =false;
		  for(Account acc : accounts) 
		  {
			  if(acc.getAccid()== passcode && acc.getPasscode()== passcode) 
			  {
				  exist = true;
				  account = acc;
			  }
		  }
		  if(exist) {
			  new showMenu(scanner, account);
		  }else {
			  System.out.println("Account doesn't exist");
		  }
	}
}