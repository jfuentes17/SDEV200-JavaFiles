/*Program Name: IdenticalArrays.java
 * Author: Julian Fuentes
 * Date Last Updated: 21 January 2024
 * Purpose: This program checks whether two arrays are identical or not.
 */

import java.util.*;
import java.util.Scanner;

public class IdenticalArrays 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//This creates a new scanner.
		int[][]m1 = new int[3][3];
		int[][]m2 = new int[3][3];
		
		System.out.println("Enter list1: ");
		for (int i = 0; i < m1.length; i++)
			for (int x = 0; x < m1[i].length; x++)
				m1[i][x] = scan.nextInt();
		System.out.println("Enter list2: ");
		for (int i = 0; i < m2.length; i++)
			for (int x = 0; x < m2[i].length; x++)
				m2[i][x] = scan.nextInt();
		
		if (equals(m1,m2))
			System.out.println("The two arrays are identical.");
		else
			System.out.println("The two arrays are not identical.");
		
		scan.close();
	}
	//For awhile, I kept getting the message that the two arrays were not identical,
	//no matter what I did. After messing around with the system out print vs system out println,
	//I was finally able to get an identical.
	
	public static boolean equals(int[][] m1, int[][] m2) 
	{
		if (m1.length != m2.length)
			return false;
		//This should check if the two arrays are even of the
		//same length in digits.
		for (int i = 0; i < m1.length; i++) 
		{
			if (m1[i].length != m2[i].length)
				return false;
			//I'm pretty sure this is checking each row's length.
			for (int x = 0; x < m1[i].length; x++) 
			{
				if (m1[i][x] != m2[i][x])
					return false;
				//This is checking each number in the array is equal.
			}
		}
		return true; 
	}
}
