package abstract_concept;

public abstract class CreditCards {
	
	String nameHolder;
	int CardID;
	int EXP_Date;
	short CSV_Code;
	
	
	public String getCreditCard() {
		return("nameHolder : " + nameHolder + "\n"
				+"cardID : " + CardID + "\n"
				+"EXPDate : " + EXP_Date + "\n" +
				"CSV Code : " + CSV_Code + "\n"); 
	}

}
