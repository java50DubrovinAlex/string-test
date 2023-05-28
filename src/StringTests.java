import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {
	String str0 = "";
	String str1 = "qwerty";
	String str2 = "qwerty";
	String str3 = "qwertz";
	String str4 = "qwerta";
	String str5 = "QWERTY";
	String str6 = "Hello planet earth, you are a great planet.";
	@Test
	void testCharAT() {
		assertEquals('q', str1.charAt(0));
		assertEquals('r', str1.charAt(3));
		assertEquals('y', str1.charAt(5));
		
	}
	@Test
	void testCompareTo() {
		assertEquals(0, str1.compareTo(str2));
		assertEquals(-25, str4.compareTo(str3));
		assertEquals(25, str3.compareTo(str4));
		
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, str1.compareToIgnoreCase(str5));
		assertEquals(-25, str4.compareToIgnoreCase(str3));
		assertEquals(25, str3.compareToIgnoreCase(str4));
	}
	@Test
	void testConcat() {
		assertEquals("qwertyQWERTY", str1.concat(str5));
		assertEquals(str6, str0.concat(str6));
	}
	@Test
	void testStarstWith() {
		assertTrue(str6.startsWith("Hell"));
		assertFalse(str6.startsWith("HELL"));
	}
	@Test
	void testEndstWith() {
		assertTrue(str6.endsWith("planet."));
		assertFalse(str6.startsWith("planet"));
	}
	@Test
	void testContains() {
		assertTrue(str6.contains("you"));
		assertFalse(str6.contains("not"));
	}
	@Test
	void testIndexOf() {
		assertEquals(6, str6.indexOf("planet"));
		assertEquals(-1, str6.indexOf("moon"));
	}
	@Test
	void testLastIndexOf() {
		assertEquals(36, str6.lastIndexOf('p'));
		assertEquals(-1, str6.indexOf('z'));
	}
		

}
