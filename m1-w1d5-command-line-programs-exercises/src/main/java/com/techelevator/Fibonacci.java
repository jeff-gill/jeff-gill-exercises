package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the 
 previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to 
that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
public class Fibonacci {

*/
/*
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter the Fibonacci number: ");
		
		String fibonacciEntry = in.nextLine();
		
		double amount = Double.parseDouble(fibonacciEntry);
		
		String outcome = " ";
		
		for (int i=0; i <= 25; i++) {
			
			
		 amount = 0;
			if(fibonacciEntry == 0) {
				return = "0";
			}
			if (fibonacciEntry = 1) {
				return ("0, " + "1");
			}
			
			if (fib[i] = fibonacciNumber);
				break;  
		}
	}
	}
		
*/

public class Fibonacci {
 
	public static int main(String[] args) {
	
	Scanner in = new Scanner (System.in); 
		
		System.out.print("Please enter the Fibonacci number: ");
		
		String fibNumber = in.nextLine();
		
		int amount = Integer.parseInt(fibNumber);
		int t1 = 0;
		int t2 = 1;
		
		for(int i = 1; i > 0; i++);
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            return sum;
        }
    }