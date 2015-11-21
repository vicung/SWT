package nimspiel;

public class Computer extends Spieler{
	
	public int doTurn(int spielzug, int anzahl){
		
		spielzug = anzahl % 4; //wenn Streichholz Anzahl durch 4 teilbar ohne Rest, 1 abziehen
		
		if (spielzug == 0){ 
    		
    		spielzug = 1;
    	}
    	
    	if (spielzug == 1) {
    		
    		System.out.println("Ich ziehe ein Streichholz.\n");
    	}
    	
    	else { // ansonsten wenn Anzahl durch 4 geteilt einen Rest ergibt, Rest abziehen
    		
    		System.out.println("Ich ziehe " + spielzug + " Streichhölzer.\n");
    	}
    	  	
    	return spielzug;
	}



}
