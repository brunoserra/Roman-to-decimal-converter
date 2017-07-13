package corpTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeralsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void deve_converter_com_letras_simples() {
		Numerals numerals = new Numerals();
		assertEquals(10, numerals.converter("X"));
	}
	
	@Test
	public void deve_converter_com_letras_dupĺas() {
		Numerals numerals = new Numerals();
		assertEquals(40, numerals.converter("XL"));
	}
	
	@Test(expected=RuntimeException.class)
	public void deve_falhar_com_letras_invalidas() {
		Numerals numerals = new Numerals();
		numerals.converter("XT");
	}

}
