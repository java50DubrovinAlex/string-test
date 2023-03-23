import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {
	String str1 = "qwerty";
	String str2 = "qwerty";
	String str3 = "qwertz";
	String str4 = "qwerta";
	String str5 = "QWERTY";
	String str6 = "Hello planet earth, you are a great planet.";
	@Test
	void testCharAT() {
		assertEquals('q', str1.charAt(0));
		assertTrue(str1.charAt(1) == 'w' );
		assertFalse(str1.charAt(5) != 'y');
		
	}
	@Test
	void testCompareTo() {
		assertEquals(0, str1.compareTo(str2));
		assertTrue(str1.compareTo(str3) < 0);
		assertTrue(str1.compareTo(str4) > 0);
		
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, str1.compareToIgnoreCase(str5));
		assertTrue(str1.compareToIgnoreCase(str3) < 0);
		assertTrue(str1.compareToIgnoreCase(str4) > 0);
	}
	@Test
	void testConcat() {
		assertEquals("qwertyQWERTY", str1.concat(str5));
	}
	@Test
	void testStarstWith() {
		assertTrue(str1.startsWith("qwer"));
		assertFalse(str1.startsWith("QWE"));
	}
	@Test
	void testEndstWith() {
		assertTrue(str1.endsWith("rty"));
		assertFalse(str1.startsWith("RTY"));
	}
	@Test
	void testContains() {
		assertTrue(str1.contains("qwer"));
		assertFalse(str1.contains("abc"));
	}
	@Test
	void testIndexOf() {
		assertEquals(6, str6.indexOf("planet"));
		assertEquals(-1, str6.indexOf(str1));
	}
	@Test
	void testLastIndexOf() {
		assertEquals(36, str6.lastIndexOf('p'));
		assertEquals(-1, str6.indexOf('z'));
	}
		

}
