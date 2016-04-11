package com.devtux.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreditCardUtilsTest {

	@Test
	public void test() {
		//Setup 
		 String ccNumber="1234567891234567";
		 
		//execute
		String result = CreditCardUtils.mask(ccNumber);
		//assert
		String expected = "XXXXXXXXXXXX4567";
		
		assertEquals(expected, result);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void test_nulls(){
		//Setup 
		String ccNumber = null;
		
		//execute
		String result = CreditCardUtils.mask(ccNumber);
	}
}
