package com.devtux.junit;

public class CreditCardUtils {
	
	public static String mask(String ccNumber){
		
		if(ccNumber == null){
			throw new IllegalArgumentException("Must provide a cc Number ");
		}
		
		return "XXXXXXXXXXXX"+ ccNumber.substring(ccNumber.length()-4);
	}
}
