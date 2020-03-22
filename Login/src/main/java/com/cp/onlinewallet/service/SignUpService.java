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
    static String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{4,14})";
    
    public static boolean validatePassword(String password) {//password validation
    	pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
 	public static boolean validEmail(String email) { //email validation
 		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + 
 							"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";  
 							
 		Pattern pat = Pattern.compile(emailRegex); 
// 		if (email == null) 
// 			return false; 
 		return pat.matcher(email).matches();  
 	} 
	public SignUp signUpUserService(SignUp signUp) throws SignUpException{ //validating the details entered by user
		SignUp result=null;
		Character firstChar=signUp.getUserName().charAt(0);
//		String empty = null;
//    		if(!(signUp.getUserName().equals(empty))) { 
    			if(signUp.getPhoneNumber().length()==10) {
    				if(validatePassword(signUp.getPassword())) {
    					if (signUp.getPassword().equals(signUp.getConfirmPassword())) {
    						if (validEmail(signUp.getEmail())) {
    							if((Character.isUpperCase(firstChar))) {
    								SignUpDao signUpService=new SignUpDao();
    								result=signUpService.signUpUserDao(signUp);
    							}
    							else 
    								throw new SignUpException("Name should not start with special characters and first letter should be capital\nPlease Re-enter the details\n ");
    							}
    						else
    							throw new SignUpException("Email is invalid\nPlease Re-enter the details\n "); 
    						}
    					else
    						throw new SignUpException("Password does not match\nPlease Re-enter the details\n");
    					}
    				else
    					throw new SignUpException("Password does not fulfill the criteria\nPlease Re-enter the details\n");
    				}
    			else 
    				throw new SignUpException("Phone Number should be of 10 digit\nPlease Re-enter the details\n");
//    			}
//    		else 
//    			throw new SignUpException("Name can not be Null\nPlease Re-enter the details\n");
    		
    		if(result!=null) {
    			throw new SignUpException("Congratulations...\nUser Registered");
    		}
    		else {
    			return result;
    		 
    		}
		}
	public String signUpTest(String uName, String pass, String cpass, String pn, String em) {//testing and return condition
		String userName=uName, password=pass, phoneNumber= pn,confirmPassword=cpass, email=em;
	    //int uId = (Integer) userId;
    	SignUpService signUpService=new SignUpService();
    	SignUp signUp=new SignUp(userName, password, confirmPassword, phoneNumber, email );
    	try {
			signUp=signUpService.signUpUserService(signUp);	
		}   
		catch(SignUpException e) {
			System.out.println(e.getMessage());
		}
    	return (/*signUp.getUserId()+*/signUp.getUserName()+" "+signUp.getPassword()+" "+signUp.getConfirmPassword()+" "+signUp.getPhoneNumber()+" "+signUp.getEmail());
	}
}
	