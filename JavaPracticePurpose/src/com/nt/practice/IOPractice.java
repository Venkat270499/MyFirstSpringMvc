package com.nt.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class IOPractice {

	
	public static void main(String[] args)throws Exception {
		InputStream is=new FileInputStream("D:\\java\\Hello.txt");
		char[] sampletxt=new String(is.readAllBytes() ).toCharArray();
		OutputStream fos=new FileOutputStream("D:\\java\\OutputHello.txt");
		for(char c:sampletxt) {
			System.out.print(c);
			fos.write(c);
		}
		//File fl=new File("D:\\java\\OutputHello.txt");
		//OutputStream fos=new FileOutputStream("D:\\java\\OutputHello.txt");
		
		//IOUtils.copy(is,fos);
		is.close();
		fos.close();
		System.out.println("file copied and saved sucessfully");
	}
	
}
