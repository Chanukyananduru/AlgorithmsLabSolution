package com.greatlearning.currency;
import java.util.Scanner;  

public class Denominations {
	public int size;
	private int [] denominations;
	Scanner sc=new Scanner(System.in); 
	
	public void askSize(){
		System.out.println("Enter the unique number of denominations available in the country you are travelling in:");  
		size = sc.nextInt();
		
	}
	
	public void askValues(){
		denominations = new int [size];
		System.out.println("Enter the values of the " + size + " denominations:");	
		for(int i=0; i<size; i++){  
			//reading denomination values from the user   	
			denominations[i]=sc.nextInt();  
		}  
	}
	
	public void displaySortedDenominations(){
		System.out.println("The sorted values of the " + size + " denominations you entered are:");
		int temp = 0;
		for (int i=0; i<size-1; i++) {
			for (int j=0; j<(size-i-1);j++) {
				if (denominations[j]<denominations[j+1]) { 
					temp = denominations[j]; //swapping 
					denominations[j]= denominations[j+1];
					denominations[j+1]= temp;
				}
			}
		}
		for(int i=0; i<size; i++){  
			System.out.print(denominations[i]+ " "); 
			
		}
		System.out.println();
	}
	
	public int[] getdenominations(){
		return denominations;
	}
	
	
}
