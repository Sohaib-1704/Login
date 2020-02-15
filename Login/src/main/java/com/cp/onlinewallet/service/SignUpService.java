package com.cp.onlinewallet.service;

import java.util.List;

import com.cp.onlinewallet.dao.SignUpDao;
import com.cp.onlinewallet.dto.SignUp;

public class SignUpService {
	SignUpDao signUpDao = new SignUpDao();
	public boolean addSignUpService(SignUp signUp) {
		return (signUpDao.addSignUp(signUp));
	}
	public List<SignUp> getSignUp(){
		return signUpDao.getSignUpList();
	}
}
