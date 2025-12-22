package com.UsingFileClass;

import java.io.*;

public class FileHandlingUsingStream {
	public static void main(String[] args) {
		File file =new File("D:\\FileHandling\\Third.txt");
			try {
				
				
				//creating file
				if(file.createNewFile()) {
					System.out.println("File is created");
				}else {
					System.out.println("File Exist");
				}
				
				
				//write into file
				FileOutputStream fo=new FileOutputStream(file);
				String str ="Tata bye bye";
				byte[] b=str.getBytes();
				fo.write(b);
				fo.close();
				
				
				//read from file
				FileInputStream fi=new FileInputStream(file);
				int num=0;
				while((num=fi.read())!=-1) {
					System.out.print((char)num);
				}
				fi.close();
				
				
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
