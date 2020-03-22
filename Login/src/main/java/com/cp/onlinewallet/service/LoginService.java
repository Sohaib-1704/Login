package com.cp.onlinewallet.service;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinewallet.dao.LoginDao;
import com.cp.onlinewallet.dto.SignUp;

public class LoginService {
	static List<SignUp> loginList1 = new ArrayList<SignUp>();
	LoginDao loginDao = new LoginDao();
	public boolean validateLogin(String userName,String password) {//validating the login condition from login doa
		loginList1=loginDao.getLoginDetails();
		for (SignUp i : loginList1) {
			if (userName.equals(i.getUserName()) && password.equals(i.getPassword())) { 
				return true;
			} 
		} 
		return false;
	}
}