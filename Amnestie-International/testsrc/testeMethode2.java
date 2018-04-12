import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testeMethode2 {

	@Test
	public void test() {
		Methode2 testekerkeroeffnen = new Methode2()	;
		testekerkeroeffnen.i=2;
		testekerkeroeffnen.geoeffnet=1;
		testekerkeroeffnen.zellenTuerenAnzahl= new boolean [101];
		
	testekerkeroeffnen.methodeAusfuehren();
	
	assertEquals(10, testekerkeroeffnen.geoeffnet);
	
	}

	
		
	}


