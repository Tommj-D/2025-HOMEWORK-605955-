package it.uniroma3.diadia;


/*Giocatore ha la responsabilità di gestire i CFU del giocatore e di
memorizzare gli attrezzi in un oggetto istanza della classe Borsa*/
public class Giocatore {
	 
	static final private int CFU_INIZIALI = 5;
	
	private int cfu;
	private Borsa borsa;
	
	/**
	 * costruttore di default classe giocatore
	 */
	public Giocatore() {
		this(CFU_INIZIALI, Borsa.DEFAULT_PESO_MAX_BORSA);
	}
	
	/**
     * @param cfu il numero iniziale di CFU
     * @param pesoMaxBorsa il peso massimo consentito per la borsa del giocatore
     */
	public Giocatore(int cfu, int pesoMaxBorsa) {
	this.cfu = CFU_INIZIALI;
	this.borsa = new Borsa(pesoMaxBorsa);
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}

	public Borsa getBorsa() {
		return borsa;
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}	
	
}
