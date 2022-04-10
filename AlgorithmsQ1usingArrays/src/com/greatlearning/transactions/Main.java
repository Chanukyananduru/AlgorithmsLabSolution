package com.greatlearning.transactions;


public class Main {

	public static void main(String[] args) {

		Transactions transactions = new Transactions();
		transactions.askSize(); //To ask the size of the transaction values array
		transactions.askValues(); //To take input of the transaction values from the user
		transactions.displayValues(); //Not part of the question
		
		Targets targets = new Targets();
		targets.targetsInput(); //To ask how many targets the user wants to evaluate
		targets.targetsCheck(transactions.getTransactions()); //Evaluate for each target the user enters
		

	}

}
