package com.UsingFileClass;

import java.io.*;

public class FileHandlingUsingFileClasses {

	public static void main(String[] args) {
		File file =new File("D:\\FileHandling\\First.txt");
		try {
			//creating file
			if(file.createNewFile()) {
				System.out.println("File is created");
			}else {
				System.out.println("File Exist");
			}
			
			
			//Write into file
			FileWriter fw=new FileWriter(file);
			fw.write("Hello Good Evening !!!");
			fw.close();
			
			
			//Read from file
			FileReader fr=new FileReader(file);
			int num=0;
			while((num=fr.read())!=-1) {
				System.out.print((char)num);
			}
			fr.close();
			
			
			//delete file
			System.out.println();
			if(file.delete()) {
				System.out.println("File is deleted.");
			}else {
				System.out.println("File does not exist.");
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
