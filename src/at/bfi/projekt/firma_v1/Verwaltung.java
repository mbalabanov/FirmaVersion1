package at.bfi.projekt.firma_v1;

class Verwaltung {

	public static void main(String[] args) {
		final int SIZE = 12;

		Mitarbeiter[] mitarbeiterListe = new Mitarbeiter[SIZE];

		Arbeiter arbeiter_0 = new Arbeiter(1, "Joe", 29.1, 109, 94.4);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Mimi", 31.7, 97, 101.3);
		Arbeiter arbeiter_2 = new Arbeiter(3, "Bodo", 17.2, 83, 44.9);
		Arbeiter arbeiter_3 = new Arbeiter(4, "Frauke", 27.8, 134, 104.7);
		Arbeiter arbeiter_4 = new Arbeiter(5, "Nepomuk", 23.7, 124, 114.1);
		Arbeiter arbeiter_5 = new Arbeiter(6, "Pippilotta", 22.5, 123, 111.8);

		Angestellter angestellter_6 = new Angestellter(7, "Detlef", 2400.00, 1211.30);
		Angestellter angestellter_7 = new Angestellter(8, "Solveig", 2800.00, 1309.80);
		Angestellter angestellter_8 = new Angestellter(9, "Hasso", 1812.23, 992.20);
		Angestellter angestellter_9 = new Angestellter(10, "Freimuthe", 1903.67, 1489.10);
		Angestellter angestellter_10 = new Angestellter(11, "Knut", 1407.95, 1298.21);
		Angestellter angestellter_11 = new Angestellter(12, "Thussnelda", 1703.67, 1496.21);

		mitarbeiterListe[0] = arbeiter_0;
		mitarbeiterListe[1] = arbeiter_1;
		mitarbeiterListe[2] = arbeiter_2;
		mitarbeiterListe[3] = arbeiter_3;
		mitarbeiterListe[4] = arbeiter_4;
		mitarbeiterListe[5] = arbeiter_5;

		mitarbeiterListe[6] = angestellter_6;
		mitarbeiterListe[7] = angestellter_7;
		mitarbeiterListe[8] = angestellter_8;
		mitarbeiterListe[9] = angestellter_9;
		mitarbeiterListe[10] = angestellter_10;
		mitarbeiterListe[11] = angestellter_11;

		Mitarbeiter testMitarbeiter1 = Mitarbeiter.suche(mitarbeiterListe, 3);
		Mitarbeiter testMitarbeiter2 = Mitarbeiter.suche(mitarbeiterListe, 8);

		System.out.println("\nAusgabe einzelner Mitarbeiter,\nnachdem sie ueber die ID gefunden wurden:\n");
		Mitarbeiter.ausgabe(testMitarbeiter1);
		Mitarbeiter.ausgabe(testMitarbeiter2);

		System.out.println("\n\nAusgabe der gesamten MitarbeiterListe");
		System.out.println("=========================================\n");

		Mitarbeiter.ausgabe(mitarbeiterListe);

		System.out.print("\nAnzahl der Angestellten: ");
		System.out.print(Mitarbeiter.getAnzAngestellterGesamt(mitarbeiterListe));

		System.out.print("\nAnzahl der Arbeiter: ");
		System.out.print(Mitarbeiter.getAnzArbeiterGesamt(mitarbeiterListe) + "\n");

	}

}