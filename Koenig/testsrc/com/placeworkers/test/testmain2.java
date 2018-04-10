package com.placeworkers.test;

public class testmain2 {

	public static void main(String[] args) {

		int i = 2;
		int geoeffnet = 1;

		boolean[] zellenTuerenAnzahl2 = new boolean[101];

		System.out.println("\nVariante 2");

		for (int j = 0; j < zellenTuerenAnzahl2.length; j++) {
			zellenTuerenAnzahl2[j] = true;
		}
		while (i <= 100) {
			for (int j = 0; j < zellenTuerenAnzahl2.length; j++) {
				if (j % i == 0) {
					zellenTuerenAnzahl2[j] = !zellenTuerenAnzahl2[j];
				}
			}
			i++;
		}
		System.out.print("\nOffene Zellen:" + "\n1");

		for (int j = 0; j < zellenTuerenAnzahl2.length; j++) {
			if (j == 0) {
				j++;
			}
			if (j > 1 && zellenTuerenAnzahl2[j]) {
				System.out.print("," + j);

				geoeffnet++;
			}
		}
		System.out.println("\nAnzahl offene Türen bei Variante 2: " + geoeffnet);
		return;
	}

	public boolean zellenTuerenAnzahl2(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}
}
