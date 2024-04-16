package com.stringspractice.main;
/*
 * This class will replace every asked letter to another given  letter
 */
public class LetterReplacement {
	
	public static String letterReplacement(String text, String letterToreplace, String letterToreplaceWith) {
		
		String newText = text;
		//newText.replaceAll(letterToreplace, letterToreplaceWith); //did not work
		for( ; newText.contains(letterToreplace); ){
			StringBuilder newTextBuilt = new StringBuilder();
			int index = newText.indexOf(letterToreplace);
			newText = newTextBuilt.append(newText).delete(index, index + 1).insert(index, letterToreplaceWith).toString();
		}
		return newText;
	}

	public static void main(String args []) {
		
		//This is text to check method letterReplacement(String text, String letterToreplace, String letterToreplaceWith);
		String text = new String("We are good today. It is 16.04.2024. This is good.");
		//This is letter should be replaced
		String letter1 = "g";
		//This is letter to replace with
		String letter2 = "m";
		
		String newText = letterReplacement(text, letter1, letter2);
		//This is calling print() method to show new text to console
		System.out.print(newText);
	}
}
