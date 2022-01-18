package com.adactin.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;

public class Hooks {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario title:" + name);
	}

	@After
	public void afterHooks(Scenario scenario) {

	}
}
