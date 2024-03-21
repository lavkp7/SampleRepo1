package com.training.utility;

import java.util.Currency;
import java.util.Locale;

public class currencyDemo {
	
	public static void main(String[] args) {
		Currency c = Currency.getInstance(Locale.UK);
		
		System.out.println("The currency code for "+Locale.UK+" is "+c.getCurrencyCode());
		
		
	}

}
