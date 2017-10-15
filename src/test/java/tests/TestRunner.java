package tests;

import org.junit.runner.Result; 
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args){
		Result results = JUnitCore.runClasses(TestEmployeeLogic.class); 
		
		for (Failure failure : results.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(results.wasSuccessful());
	}
}




