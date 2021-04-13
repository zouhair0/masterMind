package com.zmt.masterMind;

import java.util.Random;
import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(9999);
		String secretCode = String.format("%04d", randomNumber);
		System.out.println("Please type a 4-digit code ");
		
		while (scanner.hasNextLine()) {
			String expectedCode = scanner.nextLine();
			
			if( expectedCode.length() != 4 ) {
				System.err.println("Error, the code must contain 4 digits ");
				continue;
			}
			
			if(secretCode.equals(expectedCode)) {
				System.out.println("You win ! ");
				break;
			}

			String match = calculate(secretCode, expectedCode);
			String response = match.equals("") ? "Sorry, no match !" : match;
			System.out.println(response);
		}
		scanner.close();
		
	}
	
	public static String calculate (String secret, String expected) {
		String exactMatch = "";
		String partialMatch = "";
		String temp = "";

		for (int i = 0; i < expected.length(); i++) {
			temp = expected.substring(i+1);
			if(secret.charAt(i) == expected.charAt(i)) {
				exactMatch = exactMatch + "+";
			} else if (secret.contains(Character.toString(expected.charAt(i))) && !temp.contains(Character.toString(expected.charAt(i))) ) {
				partialMatch = partialMatch + "-";	
			}
		}
		return exactMatch + partialMatch;
	}
}
