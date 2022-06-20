package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestSherlockAndSquares {
	
	SherlockAndSquares sherlockServ = new SherlockAndSquares();
	
	@Test
	void testOne() {
		long testNumOne = 24;
		long testNumTwo = 49;
		
		long expected = 3;
		long result = sherlockServ.findPerfectSquares(testNumOne, testNumTwo);
		
		assertEquals(expected, result, "between 24 and 49");
	}
	
	@Test
	void testTwo() {
		long testNumOne = 3;
		long testNumTwo = 9;
		
		long expected = 2;
		long result = sherlockServ.findPerfectSquares(testNumOne, testNumTwo);
		
		assertEquals(expected, result, "between 3 and 9");
	}
	
	@Test
	void testThree() {
		long testNumOne = 17;
		long testNumTwo = 24;
		
		long expected = 0;
		long result = sherlockServ.findPerfectSquares(testNumOne, testNumTwo);
		
		assertEquals(expected, result, "between 17 and 24");
	}
	
//	@Test
	void testFour() {
		long testNumOne = 1;
		long testNumTwo = 1000000000;
		
		long expected = 31622;
		long result = sherlockServ.findPerfectSquares(testNumOne, testNumTwo);
		
		assertEquals(expected, result, "between 1 and 1 billion");
	}
	
	@Test
	void testFive() {
		long testNumOne = 49;
		long testNumTwo = 24;
		
		long expected = 3;
		long result = sherlockServ.findPerfectSquares(testNumOne, testNumTwo);
		
		assertEquals(expected, result, "between 49 and 24 (backwards order)");
	}
	
	//************
	// SPEEDY BOIS
	//************
	@Test
	void testFastOne() {
		long testFastNumOne = 24;
		long testFastNumTwo = 49;
		
		long expected = 3;
		long result = sherlockServ.findPerfectSquaresFast(testFastNumOne, testFastNumTwo);
		
		assertEquals(expected, result, "FAST: between 24 and 49");
	}
	
	@Test
	void testFastTwo() {
		long testFastNumOne = 3;
		long testFastNumTwo = 9;
		
		long expected = 2;
		long result = sherlockServ.findPerfectSquaresFast(testFastNumOne, testFastNumTwo);
		
		assertEquals(expected, result, "FAST: between 3 and 9");
	}
	
	@Test
	void testFastThree() {
		long testFastNumOne = 17;
		long testFastNumTwo = 24;
		
		long expected = 0;
		long result = sherlockServ.findPerfectSquaresFast(testFastNumOne, testFastNumTwo);
		
		assertEquals(expected, result, "FAST: between 17 and 24");
	}
	
	@Test
	void testFastFour() {
		long testFastNumOne = 1;
		long testFastNumTwo = 1000000000;
		
		long expected = 31622;
		long result = sherlockServ.findPerfectSquaresFast(testFastNumOne, testFastNumTwo);
		
		assertEquals(expected, result, "FAST: between 1 and 1 billion");
	}
	
	@Test
	void testFastFive() {
		long testFastNumOne = 49;
		long testFastNumTwo = 24;
		
		long expected = 3;
		long result = sherlockServ.findPerfectSquaresFast(testFastNumOne, testFastNumTwo);
		
		assertEquals(expected, result, "FAST: between 49 and 24 (backwards order)");
	}
	
}
