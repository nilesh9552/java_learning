package com.StringBuffer;

public class StringClass {
public static void main(String[] args) {
//create String 
	String Name = "Nilesh";
String city = new String ("Pune");
//get length of String

System.out.println(city.length());
//Get Character by Index
System.out.println(Name.charAt(2));
// toUpperCase
System.out.println(Name.toUpperCase());
//toLowerCase
System.out.println(Name.toLowerCase());
//Compare Strings
String a ="Jagtap";
String b = "Jagtap";
System.out.println(a.equals(b));
String c ="Jagtap";
String d = "jagtap";
System.out.println(c.equalsIgnoreCase(d));

//Join Strings
String frist = "Nilesh";
String second = " Jagtap";
System.out.println(frist.concat(second)+" ");

//Check Word Exists
String fullName = "Nilesh Jagtap   ";
System.out.println(fullName.contains("p"));
//Extract Part of String
System.out.println(fullName.substring(0,6));
//replace
System.out.println(fullName.replace("Nilesh ", "Jagtap"));
//trim() → Remove Extra Spaces
System.out.println(fullName.trim());
//indexOf() → Find Position
System.out.println(fullName.indexOf("i"));
//StringBuffer (Mutable String)
StringBuffer ab =new StringBuffer("Nilesh");
ab.append("Jagtap");
System.out.println(ab);

}
}
