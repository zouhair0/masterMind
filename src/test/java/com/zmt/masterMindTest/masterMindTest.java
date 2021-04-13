package com.zmt.masterMindTest;

import org.junit.Test;

import com.zmt.masterMind.App;

import static org.junit.Assert.assertEquals;



public class masterMindTest 

{
	@Test
	public void testCalculate_1() {
		assertEquals(App.calculate("1243","1254"), "++-");
	}
	
	@Test
	public void testCalculate1_2() {
		assertEquals(App.calculate("1234","2002"), "-");
	}
	
	@Test
	public void testCalculate1_3() {
		assertEquals(App.calculate("1234" ,"2200"), "+");
	}
	
	@Test
	public void testCalculate1_4() {
		assertEquals(App.calculate("3129","1249"), "+--");
	}
	
	@Test
	public void testCalculate1_5() {
		assertEquals(App.calculate("1234","1234"), "++++");
	}
	
	@Test
	public void testCalculate1_6() {
		assertEquals(App.calculate("2234","2234"), "++++");
	}
	
	@Test
	public void testCalculate1_7() {
		assertEquals(App.calculate("7688","7680"), "+++");
	}
}
