import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;	

public class Main {

	public static void main(String[] args) {
		
			LinkedList<Integer> denominations = new LinkedList<>(); //creating list
			
			Scanner sc = new Scanner(System.in); //creating scanner for denomination values to be inserted in list
	        System.out.println("enter total number of unique denominations -> ");
	        int num_of_denominations = sc.nextInt(); // user will enter the number of transactions
	        
	        System.out.println("Enter the value of denominations");
	        while(num_of_denominations>0) { 
	            denominations.add(sc.nextInt());
	            num_of_denominations--;  // decrement till the number of transactions became 0    
	            }
	         
	        Collections.sort(denominations, Comparator.reverseOrder());
	        System.out.println("The unique denominations in sorted order are:");
	            System.out.println(denominations);
	            
	            for (int i=0; i<denominations.size(); i++ ) {
	            	System.out.print(denominations.get(i) + " ");
	            }
	            
	         System.out.println("enter total amount to be paid -> ");
	         int amount = sc.nextInt(); // user will enter the number of transactions
	    
	    
	 		
	         
	         sc.close();
	}

}
