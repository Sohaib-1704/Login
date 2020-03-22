package com.cp.onlinewallet.util;

import java.util.ArrayList;
import java.util.List;
import com.cp.onlinewallet.dto.SignUp;
 
public class SignUpRepository {
	public static List<SignUp> signUpList = new ArrayList<SignUp>();
    static int randomUserId=50;
//  	public static int getRandomUserId() { 
//		return randomUserId;
//	}
//	public static void setRandomUserId(int randomUserId) {
//		SignUpRepository.randomUserId = randomUserId; 
//	}

	public SignUpRepository() { 
		 
  	  SignUp u1=new SignUp(/*generateUserId(),*/ "Sohaib","Imroot17#","Imroot17#","8889027290","root@gmail.com");
  	  SignUp u2=new SignUp(/*generateUserId(),*/ "Aishwarya","Root@12","Root@12","7894561230","aishwaryasrivastava4@gmail.com");
  	  SignUp u3=new SignUp(/*generateUserId(),*/ "Sharon","Sh@12","Sh@12","8796543215","sharonsony98@gmail.com");
  	  SignUp u4=new SignUp(/*generateUserId(),*/ "Kiran","Ki#12","Ki#12","8855446513","krajout97@gmail.com");
  	  SignUp u5=new SignUp(/*generateUserId(),*/ "Princy","Pr@78","Pr@78","9875468525","princypandey20@gmail.com");
  	  SignUp u6=new SignUp(/*generateUserId(),*/ "Maneesh","Ma#34","Ma#34","9879878972","maani09k@gmail.com");
	  
  	  signUpList.add(u1);
  	  signUpList.add(u2);
  	  signUpList.add(u3); 
  	  signUpList.add(u4);
  	  signUpList.add(u5);
  	  signUpList.add(u6);
    }
    public List<SignUp> getSignUpList(){
  	  return signUpList;
    }    
    public List<SignUp> getLoginDetail(){
    	return signUpList;
    }
}