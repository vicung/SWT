package nimspiel;

import java.util.Random;

public class NimSpiel{
	
	public static void main (String[]args){
	
	    Random zufallszahl = new Random();
	    int anzahl = zufallszahl.nextInt(50)+5; //zuf�llige Anzahl an Streichh�lzern zwischen 5 bis 50
	    int spielzug = 0;
	    
	    Computer computer = new Computer();
	    Mensch mensch = new Mensch();
	    
	    System.out.println("Es gibt " + anzahl + " Streichh�lzer am Spielanfang.\n");
	    
	    while (anzahl > 0){
	    	spielzug = computer.doTurn(spielzug, anzahl);
	    	anzahl = computer.getAnzahl(anzahl, spielzug);
	    		    	
	    	if (anzahl == 1) {
	    		
	    		System.out.println("Ein Streichholz bleibt �brig.");
	    	}
	    	
	    	else {
	    		
	    		System.out.println(anzahl + " Streichh�lzer bleiben �brig.");
	    	}
	    	
	    	if (anzahl == 0) {
	    		System.out.println("Ich habe gewonnen!");
	    	}
	    	
	    	else {
	    		System.out.print("Du bist am Spielzug! ");
	    		
	    		spielzug = mensch.doTurn(spielzug);
	    		anzahl = mensch.getAnzahl(anzahl, spielzug);
	    			    		
	    		}
	    		
	    		if (anzahl == 1) {
		    		
		    		System.out.println("Ein Streichholz bleibt �brig.");
		    	}
		    	
		    	else {
		    		
		    		System.out.println("\n" + anzahl + " Streichh�lzer bleiben �brig.");
		    	}
	    		
	    		if (anzahl == 0) {
	    			System.out.println("Du hast gewonnen!") ;
	    		}
	    		
	    	}
	    }
	
	}


