package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BorsaTest {
	
	private Borsa borsa;
	private Attrezzo attrezzo;
	@BeforeEach
	void setUp() throws Exception {
		this.borsa = new Borsa();
		this.attrezzo = new Attrezzo("lanterna", 3);
	}
	
	/**
	 * controllo che all'inizio il peso massimo corrisponda a 10 
	 * e il corretto funzionamento di getPeso*/
	@Test
	void test_pesoMax() {
		assertEquals(10, borsa.getPesoMax());
	}
	
	@Test
	void test_isEmpty() {
		assertTrue(borsa.isEmpty());
	}
	
	/**
	 * verifico il corretto funzionamneto di addAttrezzo e una
	 *  volta aggiunto l'attrezzo, la borsa non deve essere più vuota
	 */
	@Test
	void test_addAttrezzo() {
		assertFalse(borsa.hasAttrezzo("lanterna"));
		borsa.addAttrezzo(this.attrezzo);
		assertTrue(borsa.hasAttrezzo("lanterna"));
		assertFalse(borsa.isEmpty());
	}
	
	/**
	 * verifico il corretto funzionamneto di removeAttrezzo
	 */
	
	@Test
	void test_removeAttrezzo() {
		assertTrue(borsa.isEmpty());
		borsa.addAttrezzo(this.attrezzo);
		assertFalse(borsa.isEmpty());
		borsa.removeAttrezzo(this.attrezzo);
		assertTrue(borsa.isEmpty());
	}

}
