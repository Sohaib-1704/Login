package com.cp.onlinewallet.servicetest; 

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import com.cp.onlinewallet.service.LoginService;
import com.cp.onlinewallet.ui.MainClass;

public class LoginTest {
	LoginService loginService =new LoginService();
	MainClass main = new MainClass();
	@Test
	void Test1(){
			assertEquals(true, loginService.validateLogin("Sohaib", "Imroot17#"));
	} 
	@Test
	void Test2(){
			assertEquals(true, loginService.validateLogin("Aishwarya","Root@12"));
	} 
	@Test
	void Test3(){
			assertEquals(true, loginService.validateLogin("Sharon","Sh@12"));
	} 
	@Test
	void Test4(){
			assertEquals(false, loginService.validateLogin("sohaib", "Imroot17#"));
	} 
	@Test
	void Test5(){
			assertEquals(false, loginService.validateLogin("12Sohaib", "Imroot17#"));
	} 
	@Test
	void Test6(){
			assertEquals(false, loginService.validateLogin("Sohaib", "Imroot"));
	} 
}