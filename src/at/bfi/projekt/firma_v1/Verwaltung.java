package at.bfi.projekt.firma_v1;

class Verwaltung {

	public static void main(String[] args) {

		// Konstante mit der Array-Groesse
		final int SIZE = 12;

		// Leeres Array fuer die Mitarbeiterliste
		Mitarbeiter[] mitarbeiter_liste = new Mitarbeiter[SIZE];

		// Erstellung der Arbeiterobjekte
		Arbeiter arbeiter_0 = new Arbeiter(1, "Joe", 29.1, 109, 94.4);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Mimi", 31.7, 97, 101.3);
		Arbeiter arbeiter_2 = new Arbeiter(3, "Bodo", 17.2, 83, 44.9);
		Arbeiter arbeiter_3 = new Arbeiter(4, "Frauke", 27.8, 134, 104.7);
		Arbeiter arbeiter_4 = new Arbeiter(5, "Nepomuk", 23.7, 124, 114.1);
		Arbeiter arbeiter_5 = new Arbeiter(6, "Pippilotta", 22.5, 123, 111.8);

		// Erstellung der Angestelltenobjekte
		Angestellter angestellter_6 = new Angestellter(7, "Detlef", 2400.00, 1211.30);
		Angestellter angestellter_7 = new Angestellter(8, "Solveig", 2800.00, 1309.80);
		Angestellter angestellter_8 = new Angestellter(9, "Hasso", 1812.23, 992.20);
		Angestellter angestellter_9 = new Angestellter(10, "Freimuthe", 1903.67, 1489.10);
		Angestellter angestellter_10 = new Angestellter(11, "Knut", 1407.95, 1298.21);
		Angestellter angestellter_11 = new Angestellter(12, "Thussnelda", 1703.67, 1496.21);

		// Zuweisung der Objekte zum Array mit der Liste der Mitarbeiter
		mitarbeiter_liste[0] = arbeiter_0;
		mitarbeiter_liste[1] = arbeiter_1;
		mitarbeiter_liste[2] = arbeiter_2;
		mitarbeiter_liste[3] = arbeiter_3;
		mitarbeiter_liste[4] = arbeiter_4;
		mitarbeiter_liste[5] = arbeiter_5;

		mitarbeiter_liste[6] = angestellter_6;
		mitarbeiter_liste[7] = angestellter_7;
		mitarbeiter_liste[8] = angestellter_8;
		mitarbeiter_liste[9] = angestellter_9;
		mitarbeiter_liste[10] = angestellter_10;
		mitarbeiter_liste[11] = angestellter_11;

		// Suche nach Mitarbeiter anhand der ID
		Mitarbeiter testMitarbeiter1 = Mitarbeiter.suche(mitarbeiter_liste, 3);
		Mitarbeiter testMitarbeiter2 = Mitarbeiter.suche(mitarbeiter_liste, 8);

		// Ausgabe der gefundenen Mitarbeiter
		System.out.println("\nAusgabe einzelner Mitarbeiter,\nnachdem sie ueber die ID gefunden wurden:\n");
		Mitarbeiter.ausgabe(testMitarbeiter1);
		Mitarbeiter.ausgabe(testMitarbeiter2);

		// Ausgabe der gesamten Mitarbeiterliste
		System.out.println("\n\nAusgabe der gesamten MitarbeiterListe");
		System.out.println("=========================================\n");

		Mitarbeiter.ausgabe(mitarbeiter_liste);

		// Ausgabe der Anzahl der Mitarbeiter (zuerst Angstellte dann Arbeiter)
		System.out.print("\nAnzahl der Angestellten: ");
		System.out.print(Mitarbeiter.getAnzAngestellterGesamt(mitarbeiter_liste));

		System.out.print("\nAnzahl der Arbeiter: ");
		System.out.print(Mitarbeiter.getAnzArbeiterGesamt(mitarbeiter_liste) + "\n");

	}

}