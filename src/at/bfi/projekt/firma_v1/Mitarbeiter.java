package at.bfi.projekt.firma_v1;

class Mitarbeiter {

	private int id;
	private String name;

	public Mitarbeiter(int id) {
		this.id = id;
	}

	public Mitarbeiter(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Mitarbeiter suche(Mitarbeiter[] mitarbeiterListe, int gesuchteId) {
		for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
			if (mitarbeiter.getId() == gesuchteId) {
				return mitarbeiter;
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String ausgabe() {
		return "\nMitarbeiter\n===========\nId: " + id + "\nName: " + name + "\n";
	}

	public static void ausgabe(Mitarbeiter dieserMitarbeiter) {
		if (dieserMitarbeiter instanceof Arbeiter) {
			System.out.println(dieserMitarbeiter.ausgabe());
		}
		if (dieserMitarbeiter instanceof Angestellter) {
			System.out.println(dieserMitarbeiter.ausgabe());
		}
	}

	public static void ausgabe(Mitarbeiter[] mitarbeiterListe) {
		for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
			ausgabe(mitarbeiter);
		}
	}

	public static int getAnzAngestellterGesamt(Mitarbeiter[] mitarbeiterListe) {
		int anzahlAngestellte = 0;

		for (Mitarbeiter dieserMitarbeiter : mitarbeiterListe) {
			if (dieserMitarbeiter instanceof Arbeiter) {
				anzahlAngestellte++;
			}
		}

		return anzahlAngestellte;
	};

	public static int getAnzArbeiterGesamt(Mitarbeiter[] mitarbeiterListe) {
		int anzahlArbeiter = 0;

		for (Mitarbeiter dieserMitarbeiter : mitarbeiterListe) {
			if (dieserMitarbeiter instanceof Angestellter) {
				anzahlArbeiter++;
			}
		}

		return anzahlArbeiter;
	};

}
