package com.project.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no. of floors in building");
		int numberOfFloors=sc.nextInt();
		
		for(int i=1;i<=numberOfFloors;i++) {
			System.out.println("Enter the floor size given on day :"+i);
			int order=sc.nextInt();
		}
		
		sc.close();
	}

}
