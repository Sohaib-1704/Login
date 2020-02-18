package com.cp.onlinewallet.ui;

import java.io.Serializable;

import com.cp.onlinewallet.dto.SignUp;
import com.cp.onlinewallet.exception.SignUpException;
import com.cp.onlinewallet.service.SignUpService;

public class MainClass {

	/*public static String main(String[] args) {
		List<SignUpRepository> s = new ArrayList<SignUpRepository>(100);
		List<SignUp> s1 = new ArrayList<SignUp>();
		
		System.out.println("\n1. Login \n2. SignUp");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int choice=  sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter UserName: ");
			Scanner sc1 = new Scanner(System.in);
			String user = sc1.nextLine();
			System.out.println( user);
			System.out.println("Enter Password: ");
			String pass = sc1.nextLine();
			System.out.println(pass);
			
			break;
		case 2:
			
			System.out.println("Enter UserName: ");
			String userName = sc2.nextLine();
			System.out.println("Enter Password: ");
			String password = sc2.nextLine();
			System.out.println("ConfirmPassword: ");
			String confirmPassword = sc2.nextLine();
			if (password.equals(confirmPassword))
				System.out.println("password doesn't match");
			System.out.println("Enter Email: ");
			String email=sc2.nextLine();
			System.out.println("Enter PhoneNumber: ");
			String phoneNumber=sc2.nextLine();
			
			//s.add(new SignUpRepository(userName,password,confirmPassword,email,phoneNumber));
		}
*/
	public Serializable testFun(String uName, String pass, String cpass, String pn, String em) {
		String userName=uName, password=pass, phoneNumber= pn,confirmPassword=cpass, email=em;
		//int uId = (Integer) userId;
    	SignUpService signUpService=new SignUpService();
    	
    	
    	SignUp signUp=new SignUp(userName, password, confirmPassword, phoneNumber, email );
    	
	try {
		signUp=signUpService.registerUserService(signUp);
		return (/*signUp.getUserId()+*/signUp.getUserName()+" "+signUp.getPassword()+" "+signUp.getConfirmPassword()
		+" "+signUp.getPhoneNumber()+" "+signUp.getEmail());
	}
	catch(SignUpException e) {
		System.out.println(e.getMessage());
	}
	return null;
	}
}


