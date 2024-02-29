package com.tcs.inheritance;

public class CardTransactions {

	public static void main(String[] args) {
		
		HDFCVisaDebitcard  hdfc = new HDFCVisaDebitcard(12345,"08/06", 919, "jobn", 5643,500000);
		System.out.println(hdfc);
		
		ICICIMasterCreditCard icici= new ICICIMasterCreditCard(1235,"09/01", 987, "kon", 7657, 89099);
		hdfc.swipe(10000);
		icici.swipe(2300);
		
		Card card = new HDFCVisaDebitcard(12345,"08/06", 919, "jobn", 5643,500000);
        card.swipe(677);
        
        card = new ICICIMasterCreditCard(1235,"09/01", 987, "kon", 7657, 89099);
        card.swipe(6778);
	}

}
