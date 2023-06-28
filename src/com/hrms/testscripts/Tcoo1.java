package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.Generral;

public class Tcoo1 {
	@Test
	public void tc001() {
		Generral obj = new Generral();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
	}

