package com.cg.employeemaintainence.pl;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		int choice = 0;
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1-Admin");
				System.out.println("2-Employee");
				
				System.out.println("Enter choice::");
				choice = sc.nextInt();
				choice = sc.nextInt();
			}while(choice!=0);
	}

}
}
