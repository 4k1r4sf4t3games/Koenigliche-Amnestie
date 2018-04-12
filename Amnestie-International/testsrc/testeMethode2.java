import org.junit.Test;

public class testeMethode2 {

	@Test
	public void test() {
		Methode2 testekerkeroeffnen = new Methode2()	;
		testekerkeroeffnen.i=2;
		testekerkeroeffnen.geoeffnet=1;
		testekerkeroeffnen.zellenTuerenAnzahl= new boolean [101];
		
	testekerkeroeffnen.methodeAusfuehren();
	
	assertArrayEquals(10, testekerkeroeffnen.geoeffnet);
	
	}

	private void assertArrayEquals(int i, int geoeffnet) {
		// TODO Auto-generated method stub
		
	}

}
