package com.placeworkers.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class booleantest2 {

	@Test
	public void test() {
		testmain2 testmain2 = new testmain2();

		assertTrue(testmain2.zellenTuerenAnzahl2(true));
		assertFalse(testmain2.zellenTuerenAnzahl2(false));
	}

}
