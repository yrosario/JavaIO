package jav.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriter output = null;
		String data = "You all are very good students.";
		
		
		
		char buffer[] = new char[100];
		try {
			output = new FileWriter("out.text");
			
			output.write(data);
			
			System.out.println("Data is written to the file.");
			output.close();
			
			FileReader reader = new FileReader("out.text");
			reader.read(buffer);
			System.out.println("Printing read function");
			System.out.println(buffer);
			reader.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
