package fr.craftinglabs.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanTest {

	@Test
	public void testConversionUn() {
		assertEquals("I", Roman.convert(1));
	}

	@Test
	public void testConversionCinq() {
		assertEquals("V", Roman.convert(5));
	}

	@Test
	public void testConversionDix() {
		assertEquals("X", Roman.convert(10));
	}

	@Test
	public void testConversionQuatre() {
		assertEquals("IV", Roman.convert(4));
	}

	@Test
	public void testConversionDeux() {
		assertEquals("II", Roman.convert(2));
	}

	@Test
	public void testConversionVingt() {
		assertEquals("XX", Roman.convert(20));
	}

	@Test
	public void testConversionVingtUn() {
		assertEquals("XX", Roman.convert(20));
	}

	@Test
	public void testConversionTrois() {
		assertEquals("III", Roman.convert(3));
	}

	@Test
	public void testConversionNeuf() {
		assertEquals("IX", Roman.convert(9));
	}

	@Test
	public void testConversionQuatreVingtDix() {
		assertEquals("XC", Roman.convert(90));
	}

	@Test
	public void testConversionSix() {
		assertEquals("VI", Roman.convert(6));
	}

	@Test
	public void testConversionSoixante() {
		assertEquals("LX", Roman.convert(60));
	}

	@Test
	public void testConversionSept() {
		assertEquals("VII", Roman.convert(7));
	}

	@Test
	public void testConversionSoixanteDix() {
		assertEquals("LXX", Roman.convert(70));
	}

	@Test
	public void testConversionQuatreVingt() {
		assertEquals("LXXX", Roman.convert(80));
	}

	@Test
	public void testConversionCent() {
		assertEquals("C", Roman.convert(100));
	}

	@Test
	public void testConversionCinqCents() {
		assertEquals("D", Roman.convert(500));
	}

	@Test
	public void testConversionNeufCents() {
		assertEquals("CM", Roman.convert(900));
	}

	@Test
	public void testConversionMille() {
		assertEquals("M", Roman.convert(1000));
	}

	@Test
	public void testConversionBiggest() {
		assertEquals("MMMCMXCIX", Roman.convert(3999));
	}

}

