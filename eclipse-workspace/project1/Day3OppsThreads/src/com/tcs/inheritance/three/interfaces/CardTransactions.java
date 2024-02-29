package com.tcs.inheritance.three.interfaces;

public class CardTransactions {

	public static void main(String[] args) {
		
		/*
		 * Card card = null; //compile time
		 * 
		 * card = new HDFCVisaDebitcard(12345,"08/06", 919, "jobn", 5643,500000); //run
		 * time //card.swipe(15000);
		 * 
		 * card = new ICICIMasterCreditCard(1235,"09/01", 987, "kon", 7657, 89099);
		 */
		
		CardIface iface = null;
		iface = new HDFCVisaDebitcard(12345,"08/06", 919, "jobn", 5643,500000);
		iface.swipe(15000);
		
		iface = new ICICIMasterCreditCard(1235,"09/01", 987, "kon", 7657, 89099);
		iface.swipe(67889);
		
		HDFCVisaDebitcard hdfc = (HDFCVisaDebitcard) iface;
		hdfc.swipe(0);
		
		
	}

}
