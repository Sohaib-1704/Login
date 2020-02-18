package com.cp.onlinewallet.servicetest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
//import org.junit.*;
import com.cp.onlinewallet.ui.MainClass;

public class SignUpServiceTest {

	@Test
	void SignUpTest() {	
		MainClass obj=new MainClass();
		
		assertEquals("Sohaib Imroot17# Imroot17# 8889027290 root@gmail.com",
				obj.testFun("Sohaib","Imroot17#","Imroot17#","8889027290","root@gmail.com"));	
	}
}

