package com.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		Set<Integer> s =new  HashSet<Integer>();
		s.add(25);
		s.add(36);
		s.add(45);
		s.add(52);
		s.add(43);
		
		System.out.println(s);
		System.out.println(s.contains(25));
		
	}
}
