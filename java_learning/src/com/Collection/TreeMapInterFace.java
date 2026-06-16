package com.Collection;

import java.util.TreeMap;

public class TreeMapInterFace {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(101, "Java");
		t.put(102, "Python");
		t.put(103, "HTML");
		t.put(104, "CSS");
		t.put(105, "DotNet");
		System.out.println(t);
		System.out.println(t.get(105));
		System.out.println(t.containsKey(101));
		System.out.println(t.containsValue("HTML"));
		System.out.println(t.hashCode());
		System.out.println(t.compute(101, (k,v)->("new")));
		System.out.println(t);
		System.out.println(t.isEmpty());
		System.out.println(t.remove(101, "new"));
		System.out.println(t);
		System.out.println(t.put(101, "HTML"));
		System.out.println(t);
		System.out.println(t.lowerKey(101));
		System.out.println(t.values());
		System.out.println(t.keySet());
		for(int i = 0; i <= 100; i++) {
			System.out.println("Line"+ i);
		}
		System.out.println();
	}

}
