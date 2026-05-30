package com.Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead  {
public static void main(String[] args) throws IOException{
	FileReader fr = new FileReader("C:\\Users\\Nilesh\\Desktop\\new.txt");
	int ch;
	
	while((ch = fr.read())!= -1) {
		System.out.print((char)ch);
	}
	FileWriter fw = new FileWriter("abc.txt");
	System.out.println("file is created");
	fw.write("Nilesh Jagtap");
	fw.flush();
}
}
