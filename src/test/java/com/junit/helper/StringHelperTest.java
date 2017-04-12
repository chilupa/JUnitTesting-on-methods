package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	// This is how our Output should be! 
	// Writing Unit Tests based on the actual and expected outputs.
	// AACD --> CD ; ACD --> CD ; CDEF --> CDEF ; CDAA --> CDAA

	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Position_AinFirst2Positions() {
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions(){
		 assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	/* Writing a meaningful name for the test case makes your code
	more readable and maintainable */
	
	@Test
	public void testFirstAndLastTwoCharactersTheSameForString1(){
		boolean actual = helper.areFirstAndLastTwoCharactersTheSame("CDEF");
		assertEquals(false, actual);
	}
	
	@Test
	public void testFirstAndLastTwoCharactersTheSameForString2(){
		// Alt+Shift+I on any local variable to Refactor it into a single line.
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("CDAA"));
	}
	


}
