package com.cp.onlinewallet.servicetest;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import com.cp.onlinewallet.service.SignUpService;
public class SignUpTest { 
	SignUpService signUpService =new SignUpService();
	@Test
	void Test1(){
			assertEquals("Sohaib Imroot17# Imroot17# 8889027290 root@gmail.com",
					signUpService.signUpTest("Sohaib","Imroot17#","Imroot17#","8889027290","root@gmail.com"));
	} 
	@Test
	void Test2() {
			assertEquals("aishwarya Root@12 Root@12 7894561230 aishwarya@gmail.com", 
					signUpService.signUpTest("aishwarya","Root@12","Root@12","7894561230","aishwarya@gmail.com"));
	}
	@Test
	void Test3() {
			assertEquals("Sharon sh@12 Sh@12 8796543215 sharonsony98@gmail.com",
					signUpService.signUpTest("Sharon","sh@12","Sh@12","8796543215","sharonsony98@gmail.com"));
	}
	@Test
	void Test4() {
			assertEquals("Kiran Ki#12 i#12 8855446513 krajout97@gmail.com",
					signUpService.signUpTest("Kiran","Ki#12","i#12","8855446513","krajout97@gmail.com"));
	}
	@Test
	void Test5() {
			assertEquals("Princy Pr@78 Pr@78 98468525 princypandey20@gmail.com",
					signUpService.signUpTest("Princy","Pr@78","Pr@78","98468525","princypandey20@gmail.com"));
	}
	@Test
	void Test6() {
			assertEquals("Maneesh Ma#34 Ma#34 9879878972 maani09kgmail.com",
					signUpService.signUpTest("Maneesh","Ma#34","Ma#34","9879878972","maani09kgmail.com"));
	}
	@Test
	void Test7(){
			assertEquals("  Imroot17# Imroot17# 8889027290 root@gmail.com",
					signUpService.signUpTest(" ","Imroot17#","Imroot17#","8889027290","root@gmail.com"));
	} 
}

