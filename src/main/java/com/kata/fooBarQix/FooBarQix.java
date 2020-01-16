package com.kata.fooBarQix;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author khaledbentaleb
 *
 */
public class FooBarQix implements Serializable {

	private static final long serialVersionUID = 6390061967514133248L;

	private Map<Integer, String> fooBarQix;
	private Map<Integer, String> fooBar;

	private FooBarQix() {
		fooBarQix = Map.of(3, "Foo", 5, "Bar", 7, "Qix");
		fooBar = Map.of(3, "Foo", 5, "Bar");
	}

	public String process(Integer value) {
		StringBuilder result = new StringBuilder();

		// manage the case where the value is divisible by the keys of the fooBar map
		result.append(fooBar.keySet().stream().sorted().filter(key -> value % key == 0).map(fooBar::get)
				.collect(Collectors.joining()));

		// manage the case whene we have to replace the characters that make up the
		// value with Foo-Bar-Qix strings
		result.append(String.valueOf(value).chars()
				.mapToObj(c -> fooBarQix.getOrDefault(Character.getNumericValue(c), "")).collect(Collectors.joining()));

		return result.toString().isEmpty() ? String.valueOf(value) : result.toString();

	}

	public IntConsumer print(PrintStream printer) {
		return index -> printer.println(process(index));
	}

	public void print(PrintStream printer, IntStream stream) {
		stream.forEach(i -> printer.println(process(i)));
	}

	public void print(PrintStream printer, int start, int endInclusive) {
		IntStream.range(start, endInclusive+1).forEach(i -> printer.println(process(i)));
	}

	private static class FooBarQixHolder {
		private final static FooBarQix instance = new FooBarQix();

	}

	public static FooBarQix getInstance() {
		return FooBarQixHolder.instance;
	}

	protected Object readResolve() {
		return FooBarQixHolder.instance;
	}

}
