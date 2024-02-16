package com.noorteck.testnglecture;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupingTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@Test(groups = {"Car","Japan"})
	public void honda() {
		System.out.println("honda");
	}
	@Test(groups = {"Car","Usa"})
	public void tesla() {
		System.out.println("tsla");
	}
	@Test(groups = {"Car","Germany"})
	public void benz() {
		System.out.println("benz");
	}
	@Test(groups = {"Sport","Europe"})
	public void soccer() {
		System.out.println("soccer");
	}
	@Test(groups = {"Sport","Usa"})
	public void football() {
		System.out.println("football");
	}
	@Test(groups = {"Sport","Usa","Spain","Brazil"})
	public void basketball() {
		System.out.println("basketball");
	}
	@Test(groups = {"Food","World"})
	public void taco() {
		System.out.println("taco");
	}
	@Test(groups = {"Food"})
	public void rice() {
		System.out.println("rice");
	}
	@Test(groups = {"Food"})
	public void sandwich() {
		System.out.println("sandwich");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}



}
