package com.Stream;

import java.io.File;

public class FileClass {
public static void main(String[] args) {
	File f = new File("C:\\Users\\Nilesh\\Desktop\\java_package\\com\\start\\app\\recursion.java");
	System.out.println("File Found");
	System.out.println(f.getName());
	
	System.out.println(f.getPath());
	System.out.println(f.canWrite());
	System.out.println(f.canRead());
	System.out.println(f.length());
	System.out.println(f.canExecute());
	System.out.println(f.isDirectory());
	System.out.println("   ");
	
}
}
