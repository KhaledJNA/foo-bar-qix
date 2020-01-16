package com.kata.fooBarQix;

/**
 * 
 * @author khaledbentaleb
 *
 */
public class Main {

	public static void main(String st[]) {

		// IntStream.range(1, 101).forEach(FooBarQix.getInstance().print(System.out));
		// FooBarQix.getInstance().print(System.out, IntStream.range(1, 101));

		FooBarQix.getInstance().print(System.out, 1, 100);

	}

}
