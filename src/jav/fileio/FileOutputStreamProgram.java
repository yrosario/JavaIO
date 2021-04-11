package jav.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.BufferedOutputStream;

public class FileOutputStreamProgram {
	
	public static void main(String args[]) {
		
		try {
			DataInputStream dis = new DataInputStream(System.in);
			
			FileOutputStream fout = new FileOutputStream("output_2.txt");
			
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
			System.out.println("Enter text (@ at the end):");
			
			char ch;
			
			while((ch=(char)dis.read()) != '@') {
				bout.write(ch);
			}
			bout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
