package com.kata.fooBarQix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author khaledbentaleb Unit test for simple FooBarQixTest.
 */
public class FooBarQixTest {
	private static FooBarQix fooBarQix;

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

	@Test
	public void shouldReturnFoo() {
		int value1 = 12;
		int value2 = 9;
		int value3 = 13;
		String expected = "Foo";

		String actual = fooBarQix.process(value1);
		assertEquals(expected, actual);
		actual = fooBarQix.process(value2);
		assertEquals(expected, actual);
		actual = fooBarQix.process(value3);
		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturnBar() {
		int value = 10;
		String expected = "Bar";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnFooBar() {
		int value = 51;
		String expected = "FooBar";
		String actual = fooBarQix.process(value);
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnBarFoo() {
		int value = 53;
		String expected = "BarFoo";
		String actual = fooBarQix.process(value);
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnFooBarBar() {
		int value = 15;
		String expected = "FooBarBar";
		String actual = fooBarQix.process(value);
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnFooFooFoo() {
		int value = 33;
		String expected = "FooFooFoo";

		String actual = fooBarQix.process(value);

		assertEquals(expected, actual);
	}

	

}
