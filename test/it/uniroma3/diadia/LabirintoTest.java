package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LabirintoTest {
	
	private Labirinto labirinto;
	private Stanza stanza;
	
	@BeforeEach
	void setUp() throws Exception {
		this.labirinto = new Labirinto();
		this.stanza = new Stanza("atrio");
	}

	@Test
	void test_getStanzaCorrente() {
		this.labirinto.setStanzaCorrente(this.stanza);
		assertEquals(this.labirinto.getStanzaCorrente(), this.stanza);
	}
	
	@Test
    public void test_StanzaCorrenteIniziale() {
        // Controlla che la stanza corrente iniziale sia "atrio"
        assertEquals("atrio", this.labirinto.getStanzaCorrente().getNome());
    }

    @Test
    public void test_StanzaVincente() {
        // Controlla che la stanza vincente sia "Biblioteca"
        assertEquals("Biblioteca", this.labirinto.getStanzaVincente().getNome());
    }
    
}
