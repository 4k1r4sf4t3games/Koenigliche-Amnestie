package com.placeworkers.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class booleantest1 {

	@Test
	public void test() {
		testmain testmain = new testmain();

		assertTrue(testmain.zellenTuerenAnzahl1(true));
		assertFalse(testmain.zellenTuerenAnzahl1(false));
	}

}
