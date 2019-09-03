package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionProgramming {
	
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("A/mber","Bo9b","Car6olyn","Daer5niel","E00va","Fra56nklin","90S");
		
		// :: is method references
		//nameList.forEach(System.out::print);
		
		//Printing names with length >= 3
		filterList(nameList, name -> name.length() >= 3  ? true : false );
		
		parseList(nameList, name -> name.replaceAll("[^A-Za-z]+", ""));
		
	}

	private static void filterList(List<String> nameList, Predicate<String> predicate) {
	
		nameList.forEach(name -> {
			if(predicate.test(name))
				System.out.println(name);
		});
		
	}
	
	private static void parseList(List<String> nameList, Function<String,String> function) {
		
		nameList.forEach(name -> System.out.println(function.apply(name)));
		
	}

}
