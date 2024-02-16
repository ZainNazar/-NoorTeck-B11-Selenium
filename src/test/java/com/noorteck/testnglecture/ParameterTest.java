package com.noorteck.testnglecture;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class ParameterTest {
	
	
	@BeforeClass 
	@Parameters ({"browser","url"})
	  public void beforeClass(String browser , String url) {
		System.out.println(browser);
		System.out.println(url);
	  }
	
  @Test
  @Parameters({"username","password","code"})
  public void f(String username , String password, String code) {
	  
	  System.out.println(username);
	  System.out.println(password);
	  System.out.println(code);
  }
  

  @AfterClass
  public void afterClass() {
  }

}
