package com.UsingFileClass;

import java.io.*;

public class FileHandlingUsingBuffered {
	
	
	public static void main(String[] args) {
		File file =new File("D:\\FileHandling\\Second.txt");
			//creating file
			try {
				if(file.createNewFile()) {
					System.out.println("File is created");
				}else {
					System.out.println("File Exist");
				}
				
				
				//Write into file
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("Hello this is second file");
				bw.close();
				
				
				//read from file
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				int num=0;
				while((num=br.read())!=-1) {
					System.out.print((char)num);
				}
				br.close();
				
				
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
