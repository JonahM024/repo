/*
* Class: CMSC201
* Instructor: Grinberg
* Description: JUnit test class that includes the methods length, charAt, substring, and indexOf
* Due: 07/21/25
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Jonah Martin
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {
	@Test
	public void testLength() {
		String str = "Library";
		assertEquals(7, str.length());
	}
	@Test
	public void testCharAt() {
		String str = "Notebook";
		assertEquals('N', str.charAt(0));
		assertEquals('b', str.charAt(4));
	}
	@Test
	public void testSubString() {
		String str = "Programming";
		assertEquals("Pro", str.substring(0, 3));
		assertEquals("gramming", str.substring(3));
	}
	@Test
	public void testIndexOf() {
		String str = "Java Programming";
		assertEquals(0, str.indexOf("Java"));
		assertEquals(5, str.indexOf("Programming"));
		assertEquals(-1, str.indexOf("Python"));
	}
}