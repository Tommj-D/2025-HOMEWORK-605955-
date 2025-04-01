package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GiocatoreTest {

	private Giocatore giocatore;
	
	@BeforeEach
	void setUp() throws Exception {
		this.giocatore = new Giocatore();
	}

	@Test
	void test_cfu() {
		assertEquals(giocatore.getCfu(), 5);
		giocatore.setCfu(10);
		assertEquals(giocatore.getCfu(), 10);
	}
	
}
