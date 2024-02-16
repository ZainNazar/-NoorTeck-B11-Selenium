package com.noorteck.testnglecture;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FruitTest {
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("beforeClass");
  }

  @Test(priority = 0)
  public void orange() {
	  System.out.println("orange");
  }
  
  
  @Test(priority = 5)
  public void banana() {
	  System.out.println("banana");
  }
  
  
  
  @Test(priority = 8)
  public void apple() {
	  System.out.println("apple");
  }
  
  
  
  @Test(priority = 2)
  public void grape() {
	  System.out.println("grape");
  }
  
  
  @Test(priority = 2)
  public void mango() {
	  System.out.println("mango");
  }
  
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass");
  }

}
