package com.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInteraface {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
a.add(50);
a.add(60);
a.add(70);
a.add(80);
//System.out.println(a);
////a.clone();
////a.addFirst(1);
//a.contains(20);
//System.out.println(a.contains(20));
//System.out.println(a.hashCode());
//System.out.println(a.isEmpty());
//System.out.println(a.size());
//System.out.println(a.indexOf(50));
//System.out.println(a.isEmpty());
////System.out.println(a.remove(10%2==0));
//System.out.println(a.get(5));
//Iterator<Integer> i = a.iterator();
//while(i.hasNext()) {
//	System.out.println(i.next());
//	
//}
//System.out.println("==============");
//for(int j : a) {
//	System.out.println(j);
//	
//}
//
////System.out.println(a.removeIf(n->n%2==0));
//System.out.println(a);
LinkedList<Integer> l1 = new LinkedList<Integer>();
l1.add(20);
l1.add(30);
l1.add(40);
l1.add(50);
l1.add(40);
l1.add(50);
l1.add(60);
l1.add(70);
l1.add(80);
System.out.println(l1);
System.out.println(l1.addAll(a));
System.out.println(l1);
System.out.println(l1.retainAll(a));
System.out.println(l1);

}



}
