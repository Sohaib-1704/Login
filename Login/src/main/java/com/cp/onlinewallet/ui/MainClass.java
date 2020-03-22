package com.cp.onlinewallet.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cp.onlinewallet.dto.SignUp;
import com.cp.onlinewallet.exception.LoginException;
import com.cp.onlinewallet.service.LoginService;
import com.cp.onlinewallet.service.SignUpService;

public class MainClass {

	public static void main(String[] args) throws LoginException {
		
		List<SignUp> signUp = new ArrayList<SignUp>();
		SignUpService signUpService = new SignUpService();
		LoginService loginService = new LoginService(); 
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
		Scanner scanner2=new Scanner(System.in);
		Scanner scanner3=  new Scanner(System.in);
		Scanner scanner4= new Scanner(System.in);
		System.out.println("Choose any one\n1. SignUp"); 
		System.out.println("2. Login");
		System.out.println("0. Exit");
		int input=scanner.nextInt();
		while(input!=0) {
			if (input==1) {	
				System.out.println("Enter UserName with first character as capital: ");
				String userName = scanner2.nextLine();
				System.out.println("Enter Password (containing atleast 1 uppercase character, lowercase characters, digits and special characters): ");
				String password = scanner2.nextLine();
				System.out.println("Confirm Password(Re-enter the password typed above): ");
				String confirmPassword = scanner2.nextLine();
				System.out.println("Enter Phone Number(Phone Number should be of 10 digits): ");
				String phoneNumber=scanner2.nextLine();
				System.out.println("Enter a valid Email with correct format: ");
				String email=scanner2.nextLine();		
				signUp.add(new SignUp(userName,password,confirmPassword,phoneNumber,email));
				System.out.println(signUpService.signUpTest(userName, password, confirmPassword, phoneNumber, email));
				System.out.println("Choose any one\n1. SignUp");
				System.out.println("2. Login");
				System.out.println("0. Exit");
				input=scanner.nextInt();
				
			}
			else if(input==2) {
				System.out.println("username: ");
				String uname= scanner1.nextLine();
				System.out.println("password: ");
				String pass= scanner1.nextLine();
				System.out.println("Login condition: "+loginService.validateLogin(uname, pass));
				if (loginService.validateLogin(uname, pass)==true) {
					System.out.println("Welcome to stonkexchange..\nThe Future of Logins..");
				}
				else {
					System.out.println("Forgot password??\nEnter 1");
					int n = scanner3.nextInt();
					if (n==1) {
						System.out.println("What is your favourite sport?: ");
						String answer="volleyball";
						String question= scanner4.nextLine();
						if(question.equals(answer)) {
							System.out.println("Login condition: true\nWelcome...");
						}
						else{
							System.out.println("Login condition: false\nExiting....");
							System.exit(0);
						}
					}
					else {
						System.exit(0);
					}
				}
				System.out.println("Choose any one\n1. SignUp");
				System.out.println("2. Login");
				System.out.println("0. Exit");  
				input=scanner.nextInt();
			}
			else if (input==0) {
				System.exit(0);
			}
			else {
				System.out.println("We don't do that here: \nPress only the following: ");
				System.out.println("1. SignUp");
				System.out.println("2. Login");
				System.out.println("0. Exit");
				input=scanner.nextInt();
			}
		}
		scanner.close();
		scanner1.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
	}
}
