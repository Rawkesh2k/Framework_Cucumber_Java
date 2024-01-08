package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@RegTest")
	public void beforeRegTest()
	{
		System.out.println("Before RegTest success");
	}
	@Before("@SmokeTest")
	public void beforeSmokeTest()
	{
		System.out.println("Before SmokeTest success");
	}
}
