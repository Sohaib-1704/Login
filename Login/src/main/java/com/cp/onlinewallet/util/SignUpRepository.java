package com.cp.onlinewallet.util;

import java.util.ArrayList;
import java.util.List;
import com.cp.onlinewallet.dto.SignUp;

public class SignUpRepository {
	public static List<SignUp> signUpList = new ArrayList<SignUp>();
    static int randomUserId=50;
   /* public Integer generateUserId() {
  	  randomUserId+=1;
  	  return (randomUserId);
    }  
    public static List<SignUp> getSignUp() {
		return signUpList;
	}
	public static void setUser(List<SignUp> user) {
		SignUpRepository.signUpList = user;
	}*/
	public static int getRandomUserId() {
		return randomUserId;
	}
	public static void setRandomUserId(int randomUserId) {
		SignUpRepository.randomUserId = randomUserId;
	}

	public SignUpRepository() {
  	  SignUp u1=new SignUp(/*generateUserId(),*/ "Sohaib","12345","12345","8889027290","imsohaibsk17@gmail.com");
  	  SignUp u2=new SignUp(/*generateUserId(),*/ "Aishwarya","12345","12345","7894561230","aishwaryasrivastava4@gmail.com");
  	  SignUp u3=new SignUp(/*generateUserId(),*/ "Sharon","12345","12345","8796543215","sharonsony98@gmail.com");
  	  SignUp u4=new SignUp(/*generateUserId(),*/ "Kiran","12345","12345","8855446513","krajout97@gmail.com");
  	  SignUp u5=new SignUp(/*generateUserId(),*/ "Princy","12345","12345","9875468525","princypandey20@gmail.com");
  	  SignUp u6=new SignUp(/*generateUserId(),*/ "Maneesh","12345","12345","9879878972","maani09k@gmail.com");
	  
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
}