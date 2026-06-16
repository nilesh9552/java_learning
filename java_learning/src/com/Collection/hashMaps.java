
package com.Collection;
import java.util.HashMap;


public class hashMaps {
	public static void main(String[] args) {
		HashMap<Integer , String> empId = new HashMap<>();
		empId.put(101, "Nil");
		empId.put(102, "Sam");
		empId.put(103, "Jon");
		System.out.println(empId);
		System.out.println(empId.get(101));
		System.out.println(empId.containsKey(102));
		System.out.println(empId.containsValue("Nil "));
		System.out.println(empId.size());
		System.out.println(empId.replace(101, "Jagtap"));
		System.out.println(empId);
	}

}
