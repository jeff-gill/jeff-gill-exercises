package com.techelevator;

import java.util.Scanner;

import java.util.Arrays;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);		
			
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		
		String decimalValues = in.nextLine();

		String[] decimalArray = decimalValues.split(" ");
		
		for(int i=0; i < decimalArray.length; i++) {
			
			int decimalOutput = Integer.parseInt(decimalArray[i]);
		}
		
			for(int i1=0;i1<10;i1++)
	        {
	        Object n;
			int binaryOutput = int (n%2);
	        int n = n/2;
	        Integer n = Integer.parseInt(binaryOutput[i1]);
	        }   
			
			
			System.out.println(decimalOutput + " in binary is " + binaryOutput);
		
		}

	}
	
		
		
		
		
		/*
		int[] decimalArray = new int[];
		
		int decimalArrayItem = decimalArray[i];
		
		int binaryResult = decimalArrayItem * 10;
		System.out.println(decimalArray[0] + " in binary is " + decimalArrayItem);
		
		int deciamlArrayItem = decimalArray[i + 1];
		
		
		String decimalValues = Double.parseDouble(decimalValues.split(" "));
		
	
		
		
	      String testString = Arrays.toString(seperatedDecimalValues);
	      System.out.println(testString);
		
		/*
		
		String [] = str.split(" ") ;
		*/
	