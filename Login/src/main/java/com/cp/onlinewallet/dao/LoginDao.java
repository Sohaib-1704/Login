package com.cp.onlinewallet.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinewallet.dto.SignUp;
import com.cp.onlinewallet.util.SignUpRepository;

public class LoginDao {
	static List<SignUp> loginList = new ArrayList<SignUp>();
	public List<SignUp> getLoginDetails(){//getting the details from repository
		SignUpRepository signUpRepository = new SignUpRepository();
		return loginList=signUpRepository.getLoginDetail();
	 }
}