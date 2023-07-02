package juno03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class grouping {
	
	@Test (retryAnalyzer = retry.class)
		
	public void test1() {
	
		Assert.assertEquals(true, false);
		
	}
	
	
	@Test  (priority = -1)
	public void test2() {
		System.out.println("test2");
	}

	
	@Test (groups= {"sanity"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test (groups= {"sanity"}, enabled =false, priority =-2)
	public void test4() {
		System.out.println("test4");
	}
	
	
}
