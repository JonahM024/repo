	/*
* Class: CMSC201
* Instructor: Professor Grinberg
* Description: JUnit class to test methods isPrime and PrimeNumberMethod.
* Due: 07/21/25
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Jonah Martin
*/
import static org.junit.Assert.*;
	import org.junit.Test;

	public class PrimeNumberMethodTest {
		@Test
		public void testIsPrime_PrimeNumbers() {
			assertTrue(PrimeNumberMethod.isPrime(2));
			assertTrue(PrimeNumberMethod.isPrime(3));
			assertTrue(PrimeNumberMethod.isPrime(5));
			assertTrue(PrimeNumberMethod.isPrime(13));
			assertTrue(PrimeNumberMethod.isPrime(97));
		}
		@Test
		public void testIsPrime_NonPrimeNumbers() {
			assertFalse(PrimeNumberMethod.isPrime(1));
			assertFalse(PrimeNumberMethod.isPrime(4));
			assertFalse(PrimeNumberMethod.isPrime(10));
			assertFalse(PrimeNumberMethod.isPrime(100));
		}
		@Test
		public void testIsPrime_EdgeCses() {
			assertFalse(PrimeNumberMethod.isPrime(0));
			assertFalse(PrimeNumberMethod.isPrime(-3));
			assertFalse(PrimeNumberMethod.isPrime(-11));
		}
	}