package com.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDigitCheck {

	public static void main(String[] args) {
		String regex = "(.)*(\\d)(.)*";
		Pattern pattern = Pattern.compile(regex);
		
		String input = "ABC";
		Matcher matcher = pattern.matcher(input);
		
		boolean isMatched = matcher.matches();
		
		if (isMatched) {
            System.out.println("PASS");

        } else {
            System.out.println("FAIL, Incorrect input");

        }




	}

}
