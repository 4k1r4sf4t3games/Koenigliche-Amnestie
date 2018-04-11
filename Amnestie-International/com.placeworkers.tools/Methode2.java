
public class Methode2 extends KoeniglicheAmnestie {

	int i;
	int geoeffnet;
	boolean[] zellenTuerenAnzahl;

	public Methode2() {
	}

	public Methode2(int i, int geoeffnet, boolean[] zellenTuerenAnzahl) {

		super();
		this.i = i;
		this.geoeffnet = geoeffnet;
		this.zellenTuerenAnzahl = zellenTuerenAnzahl;

	}

	public void methodeAusfuehren() {
		System.out.println("Methode2: ");
		this.zellenTuerenAnzahl = new boolean[101];

		for (int j = 0; j < zellenTuerenAnzahl.length; j++) {
			zellenTuerenAnzahl[j] = true;
		}

		while (i <= 100) {
			for (int j = 0; j < zellenTuerenAnzahl.length; j++) {
				if (j % i == 0) {
					zellenTuerenAnzahl[j] = !zellenTuerenAnzahl[j];

				}

			}
			i++;
		}
		System.out.println("\nOffene Zellen: " + "\n1");

		for (int j = 0; j < zellenTuerenAnzahl.length; j++) {
			if (j == 0) {
				j++;
			}
			if (j > 1 && zellenTuerenAnzahl[j]) {

				System.out.println("," + j );
				geoeffnet++;
			}
		}
		System.out.println("\nAnzahl offene Tueren bei Variante 2: " + geoeffnet);
	}

}
