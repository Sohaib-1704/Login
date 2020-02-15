package com.cp.onlinewallet.dao;

import java.util.ArrayList;
import java.util.List;
import com.cp.onlinewallet.dto.Login;
public class LoginDao {
	List<Login> loginList = new ArrayList<Login>();

	public List<Login> getLoginList() {
		return loginList;
	}

	public void setLoginList(List<Login> loginList) {
		this.loginList = loginList;
	}
	public boolean addLogin(Login login) {
		 return loginList.add(login);
	}
}
