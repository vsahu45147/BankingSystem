package BankMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class createAccount {

	public  createAccount(Scanner scanner, int lastaccid, ArrayList<Account> accounts) {
		System.out.println("Enter first name:");
		String firstName=scanner.next();
		System.out.println("Enter l1ast name:");
		String lastName=scanner.next();
		System.out.println("Enter balance:");
		double balance=scanner.nextDouble();
		System.out.println("Enter passcode:(digits only)");
		int passcode=scanner.nextInt();
		System.out.println("Confirm passcode:");
		int passcodec=scanner.nextInt();
		if(passcode != passcodec) {
			System.out.println("not matching\n");
			return;
		}
		int id=1000000 + lastaccid;
		lastaccid = lastaccid + 1;
		Account acc = new Account(firstName, lastName, id, balance, passcode);
		System.out.println("Your account id: " +id);
		 new showMenu(scanner,acc);
		
	}
}
	