package com.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class ByteStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\Nilesh\\Desktop\\new.txt");
	int ch; 
	ch = fin.read();
	System.out.println(ch);
	while((ch=fin.read())!=-1 ) {
		System.out.print((char)ch);
	}
	FileOutputStream fout = new FileOutputStream("C:\\Users\\Nilesh\\Desktop\\new1.txt" , true);
	fout.write(100);
	String a = "Nileh jagtap";
	String a1 = "Ty bcs";
	byte []b = a.getBytes();
	fout.write(b);

	
	}

}
