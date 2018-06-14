package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
	
//http://www.gutenberg.org/files/11/11-0.txt
		
		File alice = new File("http://www.gutenberg.org/files/11/11-0.txt");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a word to search for:  ");
		String path = userInput.nextLine();
		File f = new File(path);
	}
}
