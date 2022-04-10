package com.greatlearning.transactions;
import java.util.Scanner;  

public class Transactions {
	public int size;
	private int [] transactions;
	Scanner sc=new Scanner(System.in); 
	
	public void askSize(){
		System.out.println("Enter the size of the transactions array:");  
		size = sc.nextInt();
		
	}
	
	public void askValues(){
		transactions = new int [size];
		System.out.println("Enter the values of the " + size + " transactions:");	
		for(int i=0; i<size; i++)  {  
			//reading transaction values from the user   
			transactions[i]=sc.nextInt();  
		}  
	}
	
	public void displayValues(){
		System.out.println("The values of the " + size + " transactions you entered are:");
		for(int i=0; i<size; i++) {  
			//printing transaction values entered by the user   
			System.out.print(transactions[i]+ " "); 
		}
		System.out.println();
	}
	
	public int[] getTransactions(){
		return transactions;
	}
	
	
}
