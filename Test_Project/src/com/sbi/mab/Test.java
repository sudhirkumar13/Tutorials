package com.sbi.mab;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Sudhir", "Kiah", "Hardik", "Sunil");
		/*
		 * lst.forEach(s -> { if ("Kiah".equals(s)) { System.out.println(s); }
		 * });
		 */

		lst.stream().filter(s -> s.contains("Kiah")).forEach(System.out::println);
	}

}
