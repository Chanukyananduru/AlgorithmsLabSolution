package com.greatlearning.currency;
import java.util.Scanner;  

public class Currency {
	
	int amount;
	Scanner sc=new Scanner(System.in); 
	
	public void askAmount(){
		System.out.println("Enter the total amount to be paid:");  
		amount = sc.nextInt();
		
	}
	
	public void notesByDenomination(int denominations[]){
		System.out.println("The number of notes to be paid by denomination are ");	
		int[] num_of_notes= new int[denominations.length]; // Creating an array whose size is equal to number of denominations
		//Calculating number of notes by denomination
		for (int i = 0; i<num_of_notes.length; i++) {
			if (amount>num_of_notes[i]) {
				num_of_notes[i]=amount/denominations[i];
				amount -= num_of_notes[i]* denominations[i];
			}
		}
		//Printing number of notes by denomination
		for (int i = 0; i<num_of_notes.length; i++) {
			if (num_of_notes[i]!=0) {
				System.out.println(denominations[i]+" : "+num_of_notes[i]);
			}
		}
	
	}
}

