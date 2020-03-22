package com.cp.onlinewallet.dao;

import java.util.List;
import com.cp.onlinewallet.dto.SignUp;
import com.cp.onlinewallet.util.SignUpRepository;

public class SignUpDao { 
	SignUpRepository signUpRepository=new SignUpRepository();
	public SignUp signUpUserDao(SignUp signUp){
//		int userId=generateUserId();
//		signUp.setUserId(userId);
		List<SignUp> userList=signUpRepository.getSignUpList(); 
		boolean result=userList.add(signUp);
		if(result) 
		{
			return signUp;
		}
		else {
			return null;
		} 
	}
//	public int generateUserId() {
//		int randomUserId=SignUpRepository.getRandomUserId()+1;
//		SignUpRepository.setRandomUserId(randomUserId);
//  	  return (randomUserId);
//    }  
//	
}