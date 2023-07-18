package com.aurionpro.model;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
        int countChar=0;
        int countWord=0;
        int countLine=0;
		
		try {
			BufferedReader read = new BufferedReader(new FileReader("D:\\Training Project\\Assignments\\accountData.txt"));
			String line = read.readLine();
			while(line != null) {
				countLine++;
				String[] words = line.split(" ");
				countWord = countWord+words.length;
				
				for(String word: words) {
					countChar+= word.length();
				}
				line = read.readLine();
			}
			read.close();
			System.out.println("Number of Charecter==> "+countChar);
			System.out.println("Number of word==> "+countWord);
			System.out.println("Number of Line==> "+countLine);
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
        
        
		
	}

}
