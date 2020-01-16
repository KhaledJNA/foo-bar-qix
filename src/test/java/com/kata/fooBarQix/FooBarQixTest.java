package com.kata.fooBarQix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * @author khaledbentaleb
 * Unit test for simple FooBarQixTest.
 */
public class FooBarQixTest
{
	private static FooBarQix fooBarQix ;

	
	@BeforeAll
	public static void init() {
		fooBarQix = new FooBarQix();
	}
	
	@Test
	public void shouldReturnFooFoo() {
		int value = 3;
		String expected = "FooFoo";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);

	}
	
	
}
