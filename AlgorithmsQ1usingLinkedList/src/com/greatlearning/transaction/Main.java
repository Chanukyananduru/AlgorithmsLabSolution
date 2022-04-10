package com.greatlearning.transaction;


import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> transactions = new LinkedList<>(); //creating list
		
		Scanner sc = new Scanner(System.in); //creating scanner for transaction values to be inserted in list
        System.out.println("enter total number of transactions -> ");
        int num_of_trans = sc.nextInt(); // user will enter the number of transactions
        
        System.out.println("Enter the value of transactions");
        while(num_of_trans>0) { 
            transactions.add(sc.nextInt());
            num_of_trans--;  // decrement till the number of transactions became 0    
            }
            
        System.out.println("The transaction values entered are:");
            System.out.println(transactions);
//            
//            for (int i=0; i<transactions.size(); i++ ) {
//            	System.out.print(transactions.get(i) + " ");
//            }
            
         System.out.println("enter total number of targets to be evaluated -> ");
         int num_of_targets = sc.nextInt(); // user will enter the number of transactions
            
         for (int j=1;j<=num_of_targets;j++) {
        		System.out.println("Enter the target value");	
        		int target_value = sc.nextInt();
        		int sum = 0;
        		for (int i=0; i<transactions.size(); i++) {	
        			if (sum>=target_value) {
        				System.out.println("Target achieved after " + i+ " transaction(s)");
        				break;
        			}
        			else {
        				sum += transactions.get(i) ;
        			}
        		}
        		if (sum<target_value) {
        			System.out.println("Given target is not achieved");
        		}
        		
        }
         sc.close();
           
	}

}
