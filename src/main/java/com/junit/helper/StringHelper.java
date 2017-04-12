package com.junit.helper; 

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");
		
		// returns the characters until index 2. i.e., returns characters from index 0 and 1
		String first2Chars = str.substring(0, 2);
		// returns a String beginning at the index 2 to the last index.
		String stringMinusFirst2Chars = str.substring(2);

		// Replacing A with empty characters
		return first2Chars.replaceAll("A", "") 
				+ stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}