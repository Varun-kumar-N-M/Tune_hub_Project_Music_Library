package com.spring.lc.formatter;

import java.text.ParseException;

import java.util.Locale;

import org.springframework.format.Formatter;

import com.springlc.lc.api.Phone;




public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		return phone.getCountrycode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse meyhod of the phoneNumberFormatter");
		Phone phone = new Phone();
		String[] phoneNumberArray = completePhoneNumber.split("-");
		int index = completePhoneNumber.indexOf("-");
		if (index == -1||completePhoneNumber.startsWith("-")) 
		{
			phone.setCountrycode("91");
			if(completePhoneNumber.startsWith("-")) {
			phone.setUserNumber(phoneNumberArray[1]);
			}else {
				phone.setUserNumber(phoneNumberArray[0]);
			}
			
		}
		else 
		{
			
			phone.setCountrycode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		return phone;
	}
}
