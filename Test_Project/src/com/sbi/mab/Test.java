package com.sbi.mab;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * 
 * @author Sudhir
 *
 */
public class Test {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Sumhir", "Kiah", "Hardik", "Sunil");
		lst.stream().filter(s -> s.contains("Kiah")).forEach(System.out::println);
		System.out.println("HellopHardik");				

	}

}
