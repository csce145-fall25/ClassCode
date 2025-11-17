package com.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOuput {

	public static void main(String[] args) {
		PrintWriter out = null;
		PrintWriter log = null;
		Scanner sin = new Scanner(System.in);
		
		try {
			out = new PrintWriter(new FileOutputStream("out.txt"));
			log = new PrintWriter(new FileOutputStream("log.txt",true));
			System.out.println("enter 3 lines of text");
			for(int i = 0; i<3;++i) {
				String line = sin.nextLine() ;
				out.println(line);
				log.println(line);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (out!=null) out.close();
			if (log!=null) log.close();
		}
		
		printFileWithLineNumbers("out.txt");
		printFileWithLineNumbers("log.txt");
//		printFileWithLineNumbers("not there.txt");

		File f = new File("out.txt");
		System.out.println("f.canRead()=="+f.canRead());
		System.out.println("f.canWrite()=="+f.canWrite());
		System.out.println("f.delete()=="+f.delete());
		System.out.println("========================");
		System.out.println("f.exists()=="+f.exists());
		System.out.println("f.canRead()=="+f.canRead());
		System.out.println("f.canWrite()=="+f.canWrite());
		System.out.println("========================");
		System.out.println("f.getName()=="+f.getName());
		System.out.println("f.getPath()=="+f.getPath());
		System.out.println("f.length()=="+f.length());
		System.out.println("========================");
		System.out.println("Creating out.txt again with filler");
		PrintWriter pwout = null;
		try {
			pwout = new PrintWriter(new FileOutputStream(f));
			pwout.println("Delete contents, see log");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pwout != null) pwout.close();
		}
		System.out.println("f.exists()=="+f.exists());
		System.out.println("f.canRead()=="+f.canRead());
		System.out.println("f.canWrite()=="+f.canWrite());
		System.out.println("========================");
		System.out.println("f.getName()=="+f.getName());
		System.out.println("f.getPath()=="+f.getPath());
		System.out.println("f.length()=="+f.length());
		
	}

	private static void printFileWithLineNumbers(String fn) {
		File f = new File(fn);
		Scanner s = null;
		System.out.println("Opening "+fn+"...");
		try {
			s = new Scanner(f);
			for(int i = 1; ; ++i) {
				if(!s.hasNextLine())
					break;
				System.out.println(i +" "+ s.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if( s != null) s.close();
		}
	}
	
}
