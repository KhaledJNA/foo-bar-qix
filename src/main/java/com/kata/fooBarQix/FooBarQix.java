package com.kata.fooBarQix;

import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 
 * @author khaledbentaleb
 *
 */
public class FooBarQix implements Serializable {

	private static final long serialVersionUID = 6390061967514133248L;

	private Map<Integer, String> fooBarQix;
	private Map<Integer, String> fooBar;

	private static class FooBarQixHolder {
		private final static FooBarQix instance = new FooBarQix();

	}

	public static FooBarQix getInstance() {
		return FooBarQixHolder.instance;
	}

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

	protected Object readResolve() {
		return FooBarQixHolder.instance;
	}

}
