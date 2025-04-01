package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*test per la classe Partita prima delle modifiche fatte per via delle classi Labirinto, Borsa e Giocatore*/
class PartitaTest {
	private Partita partita;
	private Stanza atrio;
	
	@BeforeEach
	void setUp() throws Exception {
		this.partita = new Partita();
		this.atrio = new Stanza("atrio");
	}

	@Test
	void test_PartitaNonFinisce() {
		assertFalse(partita.isFinita());
	}
	
	@Test
	void test_setStanzaCorrente() {
		assertFalse(partita.getStanzaCorrente().getNome().equals("atrio"));
		partita.setStanzaCorrente(atrio);
		assertTrue(partita.getStanzaCorrente().getNome().equals("atrio"));
	}
	@Test
	void test_GetStanzaCorrente() {
		partita.setStanzaCorrente(this.atrio);
		assertEquals(partita.getStanzaCorrente().getNome(), "atrio");
	}
	
	@Test
	void test_setCfu() {
		partita.setCfu(10);
		assertEquals(10, partita.getCfu());
	}
}
