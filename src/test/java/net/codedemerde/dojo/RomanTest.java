package net.codedemerde.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanTest {

	@Test
	public void testConversionUn() {
		assertEquals("I", Roman.convert(1));
	}
	
	@Test
	public void testConversionDeux() {
		assertEquals("II", Roman.convert(2));
	}
	
	@Test
	public void testConversionTrois() {
		assertEquals("III", Roman.convert(3));
	}
	
	@Test
	public void testConversionQuatre() {
		assertEquals("IV", Roman.convert(4));
	}
	
	@Test
	public void testConversionCinq() {
		assertEquals("V", Roman.convert(5));
	}
	
	@Test
	public void testConversionSix() {
		assertEquals("VI", Roman.convert(6));
	}
	
	@Test
	public void testConversionNeuf() {
		assertEquals("IX", Roman.convert(9));
	}
	
	@Test
	public void testConversionDix() {
		assertEquals("X", Roman.convert(10));
	}
	
	@Test
	public void testConversionOnze() {
		assertEquals("XI", Roman.convert(11));
	}
	
	@Test
	public void testConversionVingt() {
		assertEquals("XX", Roman.convert(20));
	}
	
	@Test
	public void testConversionQuarante() {
		assertEquals("XL", Roman.convert(40));
	}
	
	@Test
	public void testConversionCinquante() {
		assertEquals("L", Roman.convert(50));
	}
	
	@Test
	public void testConversion90() {
		assertEquals("XC", Roman.convert(90));
	}

	@Test
	public void testConversion100() {
		assertEquals("C", Roman.convert(100));
	}
	
	@Test
	public void testConversion400() {
		assertEquals("CD", Roman.convert(400));
	}
	
	@Test
	public void testConversion500() {
		assertEquals("D", Roman.convert(500));
	}
	
	@Test
	public void testConversion900() {
		assertEquals("CM", Roman.convert(900));
	}
	
	@Test
	public void testConversion1000() {
		assertEquals("M", Roman.convert(1000));
	}
	
	@Test
	public void testConversion2999() {
		assertEquals("MMMCMXCIX", Roman.convert(3999));
	}
}

