package it.uniroma3.diadia;

public class Labirinto {
	
	private Stanza StanzaCorrente;
	private Stanza StanzaVincente;

	public Labirinto() {
		creaStanze();
	}

	/**
	 * crea tutte le stanze e le porte di collegamento
	 */
	private void creaStanze() {
		/*creo degli attrezzi*/
		Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",2);
		Attrezzo chiave = new Attrezzo("chiave",1);
		
		/*creo delle stanze*/
		Stanza atrio = new Stanza("atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		Stanza magazzino = new Stanza("Magazzino");
		
		/*collego le stanze fra loro*/
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", aulaN10);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nsud", magazzino);
		aulaN10.impostaStanzaAdiacente("est", laboratorio);
		aulaN10.impostaStanzaAdiacente("ovest", aulaN11);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN10);
		laboratorio.impostaStanzaAdiacente("nord", biblioteca);
		biblioteca.impostaStanzaAdiacente("sud", laboratorio);
		magazzino.impostaStanzaAdiacente("nord", aulaN10);
		
		/*metto gli attrezzi nelle stanze*/
		magazzino.addAttrezzo(chiave);
		aulaN11.addAttrezzo(osso);
		laboratorio.addAttrezzo(lanterna);
		
		/*stanza di partenza e di vittoria*/
		StanzaCorrente = atrio;
		StanzaVincente = biblioteca;
		
		
	}

	public Stanza getStanzaCorrente() {
		return StanzaCorrente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		StanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaVincente() {
		return StanzaVincente;
	}

	public void setStanzaVincente(Stanza stanzaVincente) {
		StanzaVincente = stanzaVincente;
	}
}
