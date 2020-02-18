package com.cp.onlinewallet.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cp.onlinewallet.dao.SignUpDao;
import com.cp.onlinewallet.dto.SignUp;
import com.cp.onlinewallet.exception.SignUpException;

public class SignUpService {
	//Password Matcher
	static Pattern pattern;
    static Matcher matcher;
    static String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,14})";
    
    public static boolean validatePassword(String password) {
    	pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
 	public static boolean validEmail(String email) { 
 		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + 
 							"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"; 
 							
 		Pattern pat = Pattern.compile(emailRegex); 
 		if (email == null) 
 			return false; 
 		return pat.matcher(email).matches(); 
 	} 
	public SignUp registerUserService(SignUp signUp) throws SignUpException{ 
		SignUp result=null;
		Character firstChar=signUp.getUserName().charAt(0);
    		if(!(signUp.getUserName()).isEmpty()) {
    			if(signUp.getPhoneNumber().length()==10) {
    				if(validatePassword(signUp.getPassword())) {
    					if (signUp.getPassword().equals(signUp.getConfirmPassword())) {
    						if (validEmail(signUp.getEmail())) {
    							if((Character.isUpperCase(firstChar))) {
    								SignUpDao signUpService=new SignUpDao();
    								result=signUpService.registerUserDao(signUp);
    							}
    							else 
    								throw new SignUpException("Name should not start with special characters and first letter should be capital");
    							}
    						else
    							throw new SignUpException("Email is invalid ");
    						}
    					else
    						throw new SignUpException("Password does not match");
    					}
    				else
    					throw new SignUpException("Password does not fulfill the criteria");
    				}
    			else 
    				throw new SignUpException("Phone Number should be of 10 digit");
    			}
    		else 
    			throw new SignUpException("Name can not be Null");
    		
    		if(result==null) {
    			throw new SignUpException("User not Registered");
    		}
    		else {
    			return result;
    		}
		}
}
