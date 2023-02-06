package com.calculation;
import com.addition.*;
import com.substraction.*;
import com.multiplication.*;
import com.division.*;

import java.util.Scanner;

public class Calculator{
	
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner input = new Scanner(System.in);
		float n1,n2;
		
		System.out.println("\nWelcome to Calculator Project!");
		
		try
		{
			while(choice != 5)
			{
				System.out.println("\n1- Addition");
				System.out.println("2 - Subtraction");
				System.out.println("3 - Multiplication");
				System.out.println("4 - Division");
				System.out.println("5 - Exit");
				System.out.println("\n Enter your Choice");
				choice = input.nextInt();
				
				if(choice == 5)
				{
					System.out.println("\nThanks for using");
					System.exit(0);
				}
				
				System.out.println("\nEnter First value");
				n1 = input.nextFloat();
				
				System.out.println("\nEnter Second value");
				n2 = input.nextFloat();
				
				if(choice == 1)
				{
					System.out.println("Sum" + Addition.addition(n1,n2));
					
				}
				else if (choice == 2)
				{
					System.out.println("Substaraction " + Substraction.substraction(n1,n2));
				}
				else if (choice == 3)
				{
					System.out.println("Multiplication " + Multiplication.mulitplication(n1,n2));
				}
				else if (choice == 4)
				{
					System.out.println("Division " + Division.division(n1,n2));
				}
				else
				{
					System.out.println("\nPlease Select the Available Choice");
				}
			
			}
			
		}
		catch (Exception ex)
		{
			System.out.println("\nError: " + ex.toString() +"occured");
		}
		
		
	}
}