package com.cp.onlinewallet.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.onlinewallet.dto.SignUp;

public class SignUpDao {
	List<SignUp> signUpList = new ArrayList<SignUp>();

	public List<SignUp> getSignUpList() {
		return signUpList;
	}

	public void setSignUpList(List<SignUp> signUpList) {
		this.signUpList = signUpList;
	}
	public boolean addSignUp(SignUp signUp) {
		 return signUpList.add(signUp);
	}
}
