package Pallavi.Selenium;

import org.testng.annotations.Test;

public class ParameterizationDemo {
	    @Test(priority=3)
	    void result() {
	        System.out.println("Result Method");
	    }
	    @Test(priority=0)
	    void orientation() {

	        System.out.println("orientaion Method");
	    }
	    @Test
	    void implementation() {

	        System.out.println("implementation Method");

	    }
	    @Test
	    void catchable() {
	        System.out.println("Catachable Method");
	    }

	}


