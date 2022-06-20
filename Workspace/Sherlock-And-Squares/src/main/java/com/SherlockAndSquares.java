package com;

public class SherlockAndSquares {

	/**
	 * Given two numbers, find the number of perfect squares between them.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public long findPerfectSquares(long a, long b) {
		long result = 0;
		// If a is higher than b, switch them
		if (a > b) {
			long swap = a;
			a = b;
			b = swap;
		}
		// A perfect square is simply a number times itself.
		for (long i = a; i <= b; i++) {
			if (testPerfectSquare(i)) {
				result++;
			}
		}
		return result;
	}

	/**
	 * Tests if a given number is a perfect square
	 * 
	 * @param l
	 * @return
	 */
	private boolean testPerfectSquare(long l) {
		double root = 0;

		root = Math.sqrt((double) l);
		root = Math.floor(root);

		if ((long) (root * root) == l) {
			return true;
		}
		return false;
	}

	/**
	 * Given two numbers, find the number of perfect squares between them. Supposed
	 * to be faster.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public long findPerfectSquaresFast(long a, long b) {
		long result = 0;
		// If a is higher than b, switch them
		if (a > b) {
			long swap = a;
			a = b;
			b = swap;
		}
		double squareA = Math.ceil(Math.sqrt((double) a));
		double squareB = Math.floor(Math.sqrt((double) b));
		result = (long) (squareB - squareA) + 1;
		return result;
	}

}
