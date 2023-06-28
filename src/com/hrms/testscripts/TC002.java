package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.Generral;

public class TC002 {
	@Test
	public void tc002() {
		Generral obj = new Generral();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}
	}


