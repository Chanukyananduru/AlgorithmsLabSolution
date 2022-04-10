package com.greatlearning.transactions;
import java.util.Scanner;  

public class Targets {
	
	int num_of_targets;
	Scanner sc=new Scanner(System.in); 
	
	public void targetsInput(){
		System.out.println("Enter the total # targets to be achieved:");  
		num_of_targets = sc.nextInt();
		
	}
	
	public void targetsCheck(int arr[]){
		for (int j=1;j<=num_of_targets;j++) {
		System.out.println("Enter the target value");	
		int target_value = sc.nextInt();
		int sum = 0;
		for (int i=0; i<arr.length; i++) {	
			if (sum>=target_value) {
				System.out.println("Target achieved after " + i+ " transaction(s)");
				break;
			}
			else {
				sum += arr[i] ;
			}
		}
		if (sum<target_value) {
			System.out.println("Given target is not achieved");
		}	
		}
	}
}

