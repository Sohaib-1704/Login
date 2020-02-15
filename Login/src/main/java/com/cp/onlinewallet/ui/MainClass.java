package com.cp.onlinewallet.ui;

import com.cp.onlinewallet.service.SignUpService;

public class MainClass {

	public static void main(String[] args) {
		SignUpService signUpService= new SignUpService();
		
		signUpService.addSignUpService(signUp)
		int choice=3;
		System.out.println("\n1. Login \n2. SignUp");
		switch(choice) {
		case 1:
			System.out.println("login");
			break;
		case 2:
			System.out.println("Signup");
		}
		
	}

}
