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
	
	@Test
	public void shouldReturnBarBar() {
		int value = 5;
		String expected = "BarBar";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);

	}
	
	@Test
	public void shouldReturnQix() {
		int value = 7;
		String expected = "Qix";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnQixQix() {
		int value = 77;
		String expected = "QixQix";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);
	}
	
	
}
