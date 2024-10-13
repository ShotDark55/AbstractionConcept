package abstract_concept;

public class Main {
	
	public static void main(String[] args) {
		
//		CreditCards cards_1 = new CreditCards();
//		this is work only if creditCards class is not abstract
		
		
		// so to fix problem just create other class
		// and inheritance credit card properties
		// with extends keyword !!
		
		
		// so i create class name connector
		
		Connectors connector = new Connectors();
		
		connector.CardID = 502532252;
		connector.CSV_Code = 323;
		connector.EXP_Date = 3000;
		connector.nameHolder = "Oussama Salmi";
		
		System.out.println(connector.getCreditCard());
		
		
		
	}
	}
		
	

