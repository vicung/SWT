package nimspiel;

import java.util.Scanner;

public class Mensch extends Spieler{
	
	Scanner scan = new Scanner(System.in);
	
	public int doTurn(int spielzug){
		spielzug = scan.nextInt();
		
		if (spielzug != 1 && spielzug != 2 && spielzug != 3) {
			
			while (spielzug != 1 && spielzug != 2 && spielzug != 3) {
    			System.out.println("Ziehe bitte Eins, Zwei oder Drei Streichhölzer!");
	    		System.out.print("Du bist am spielzug!");
	    		spielzug = scan.nextInt();
    		}
		}
		return spielzug;
	}

}
