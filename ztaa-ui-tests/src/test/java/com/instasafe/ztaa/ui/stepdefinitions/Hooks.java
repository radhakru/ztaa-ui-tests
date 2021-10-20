package com.instasafe.ztaa.ui.stepdefinitions;

import com.instasafe.ztaa.ui.core.TestBase;

import io.cucumber.java.Before;

public class Hooks extends TestBase {

	@Before
	public void BeforeSteps() {

		TestBase.init();

	}

}
