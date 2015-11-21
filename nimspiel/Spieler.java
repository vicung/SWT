package nimspiel;

public abstract class Spieler {
	
	public int getAnzahl(int anzahl, int spielzug){
		anzahl = anzahl - spielzug;
		return anzahl;
	}

	public int doTurn() {
		return 0;
	}

}
