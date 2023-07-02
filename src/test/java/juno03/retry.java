package juno03;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer 
{

	@Override
	public boolean retry(ITestResult result) {
		
		int mincount = 0;
		
		int maxcount =1;
		
		if (mincount<maxcount) {
			
			mincount++;
			return true;
			
		}
		
		
		return false;
	}

}
