package com.placeworkers.test;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int geoeffnet = 1;

		boolean[] zellenTuerenAnzahl1 = new boolean[101];
		System.out.println("Variante 1");

		for (int j = 0; j < zellenTuerenAnzahl1.length; j++) {
			zellenTuerenAnzahl1[j] = true;
		}
		boolean momentaneSituation = false;
		while (i <= 100) {
			for (int j = 0; j < zellenTuerenAnzahl1.length; j++) {
				if (j % i == 0) {
					zellenTuerenAnzahl1[j] = momentaneSituation;
				}
			}
			i++;
			momentaneSituation = !momentaneSituation;
		}
		System.out.print("\nGeöffnete Türen :" + "\n1");
		for (int j = 0; j < zellenTuerenAnzahl1.length; j++) {
			if (j == 0) {
				j++;
			}
			if (j > 1 && zellenTuerenAnzahl1[j]) {
				System.out.print("," + "\n" + j);
				geoeffnet++;
			}
		}
		System.out.println("\nAnzahl offene Türen bei Variante 1: " + geoeffnet);
		System.out.println("\n");

	}

	public boolean zellenTuerenAnzahl1(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}
}