package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class StanzaTest {
	private Stanza stanza;
	private Attrezzo spada;
	 
	@BeforeEach
	void setUp() throws Exception {
		this.stanza = new Stanza("n11");
		this.spada = new Attrezzo("spada", 0);
	}

	
	@Test
	void test_hasAttrezzoStanzaVuota() {
		assertFalse(this.stanza.hasAttrezzo("spada"));
	}
	
	@Test
	void test_hasAttrezzo(){
		assertFalse(this.stanza.hasAttrezzo("spada"));
		this.stanza.addAttrezzo(this.spada);
		assertTrue(this.stanza.hasAttrezzo("spada"));
	}


	@Test
	void test_removeAttrezzo() {
		this.stanza.addAttrezzo(this.spada);
		assertTrue(this.stanza.hasAttrezzo("spada"));
		this.stanza.removeAttrezzo(this.spada);
		assertFalse(this.stanza.hasAttrezzo("spada"));
		
	}
	
	@Test
	void test_impostaStanzaAdiacente() {
		this.stanza.impostaStanzaAdiacente("sud", this.stanza);
		assertEquals(this.stanza.getStanzaAdiacente("sud"), this.stanza);
		
	}
}
