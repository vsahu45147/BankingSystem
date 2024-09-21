package BankMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner;
	static int Lastaccid=0;
	private static ArrayList<Account> accounts;
	private static Login login;
	public static void main(String[] args) 
	{
		accounts = new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Welcome to bank management system");
		System.out.println("1. Create new account");
		System.out.println("2. Login");
		int i1=scanner.nextInt();
		switch(i1) 
		{
			case 1:
				new createAccount(scanner, Lastaccid, accounts);
				break;
			case 2:
				new Login(scanner, accounts);
				break;
		}
	}
}
			
		
	


		