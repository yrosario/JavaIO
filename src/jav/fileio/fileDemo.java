package jav.fileio;

import java.io.File;
import java.io.IOException;

public class fileDemo {

	public static void main(String[] args) {
		
		try {
			File file = new File("login.txt");
			
			if(file.createNewFile())
				System.out.println("New File created");
			else {
				if(file.exists()) {
				    System.out.println("File already exists.");
				    System.out.println("File path " + file.getPath());
				    System.out.println("File name " + file.getName());
				    System.out.println("File Class " + file.getParent());
				    System.out.println("File parent " + file.getParent());
				    System.out.println("File space allocated " + file.getUsableSpace());
				    System.out.println("File length " + file.length());
				    System.out.println("File list " + file.list());
				}
				else {
					System.out.println("file doesn't exist");
				}
				
			}
			
		/*	boolean b = file.delete();
			
			if(b) 
				System.out.println("File deleted!!");
			else
				System.out.println("File was deleted");*/
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
