package it.uniroma3.diadia;
/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Stanza stanza;
	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	
	public Partita(){
		this.finita = false;
		this.labirinto = new Labirinto();
		this.giocatore = new Giocatore();
		this.stanza = new Stanza();
	}

   
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente()== this.labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	/**
	 * Fornisce inforamzioni testuali sullo stato dei cfu del giocatore
	 */
	public String toString() {
		return this.labirinto.getStanzaCorrente()+"\nCfu = "+this.giocatore.getCfu();
	}


	public Stanza getStanzaCorrente() {
		// TODO Auto-generated method stub
		return this.stanza;
	}


	public void setStanzaCorrente(Stanza stanza) {
		this.stanza=stanza;
		
	}


	public Object getGiocatore() {
		return this.giocatore;
	}
}
