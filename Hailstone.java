// Ava Singh
// 11/7/2025
// Hailstone.java
// Gets user input and prints a sequence of numbers that eventually result in 1
// Working on: formatting, making methods work cooperate
// Testing: 1, 23, 30, 10001, -50, -1

import java.util.Scanner;

public class Hailstone
{
	private int num;
	private int count;
	
	public Hailstone()
	{
		num = 0;
		count = 0;
	}
	
	public static void main (String[]args)
	{
		Hailstone hs = new Hailstone();
		hs.findIt();
	}
	
	public void getInput()
	{
		count = 0; //reset each time
		Scanner kb = new Scanner (System.in);
		System.out.print("\nEnter a positive integer (1 - 10000). To quit, enter"
		+ " -1: ");
		num = kb.nextInt();
	}
	
	public void findIt()
	{
		System.out.println("\n\n\n");
		System.out.println("Welcome to Hailstone.java! This program will perform"
		+ " operations on a number until it equals 1.");
		while (num != -1)
		{
			getInput();
			if ((num >= 1) && (num <= 10000)) // ensure valid input
			{
				printSequence();
			}
			printCount();
		}
		
		if (num == -1) // exit case
			System.out.println("\nThank you for playing Hailstone.\n\n\n\n");
	}
	
	public void printSequence()
	{
		int perLine = 0; // keep track of how many numbers in a line
		
		System.out.println();
		
		while (num != 1)
		{
			System.out.printf("%7d", num);
			perLine ++;
			count ++;
			
			if (perLine == 10) // end of line
			{
				System.out.println();
				perLine = 0; // reset for the next line
			}
			
			if (num % 2 == 0) // even number
			{
				num /= 2;
			}
			else // odd number
			{
				num = 3 * num + 1;
			}
		}
		System.out.printf("%7d\n", 1); // print 1 (not included in while loop)
		count ++;
	}
	
	public void printCount()
	{
		if (!(num == -1)) // don't account for exit case
		{
			if ((num < 1) || (num > 10000)) // flag error + don't continue
			{
				System.out.println("\nEnter a value within the range, please!");
			}
			else
				System.out.println("\nThe loop executed " + count + " times.\n");
		}
	}
}
