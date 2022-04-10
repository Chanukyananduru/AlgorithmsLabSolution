package com.greatlearning.currency;


public class Main {

	public static void main(String[] args) {

		Denominations denominations = new Denominations();
		denominations.askSize(); //To ask the size of the denomination values array
		denominations.askValues(); //To take input of the denomination values from the user
		denominations.displaySortedDenominations(); //To display the denominations entered by user in a sorted array
		
		Currency currency = new Currency();
		currency.askAmount();
		currency.notesByDenomination(denominations.getdenominations());

	}

}
