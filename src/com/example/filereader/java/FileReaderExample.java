package com.example.filereader.java;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("D:\\FileIOExample\\hello.txt");
		char data [] = new char[20];
		file.read(data);
		
		for(char d:data){
			System.out.print(d);
		}
	}

}
