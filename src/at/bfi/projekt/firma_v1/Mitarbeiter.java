package at.bfi.projekt.firma_v1;

class Mitarbeiter {

	private int id;
	private String name;

	public Mitarbeiter() {
	}

	/**
	 * @param id
	 */
	public Mitarbeiter(int id) {
		this.id = id;
	}

	/**
	 * @param id
	 * @param name
	 */
	public Mitarbeiter(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @param mitarbeiterListe
	 * @param gesuchteId
	 * @return
	 */
	public static Mitarbeiter suche(Mitarbeiter[] mitarbeiterListe, int gesuchteId) {
		for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
			if (mitarbeiter.getId() == gesuchteId) {
				return mitarbeiter;
			}
		}
		return null;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String ausgabe() {
		return "\nMitarbeiter\n===========\nId: " + id + "\nName: " + name + "\n";
	}

	/**
	 * @param dieserMitarbeiter
	 */
	public static void ausgabe(Mitarbeiter dieserMitarbeiter) {
		if (dieserMitarbeiter instanceof Arbeiter) {
			System.out.println(dieserMitarbeiter.ausgabe());
		}
		if (dieserMitarbeiter instanceof Angestellter) {
			System.out.println(dieserMitarbeiter.ausgabe());
		}
	}

	/**
	 * @param mitarbeiterListe
	 */
	public static void ausgabe(Mitarbeiter[] mitarbeiterListe) {
		for (Mitarbeiter mitarbeiter : mitarbeiterListe) {
			ausgabe(mitarbeiter);
		}
	}

	/**
	 * @param mitarbeiterListe
	 * @return
	 */
	public static int getAnzAngestellterGesamt(Mitarbeiter[] mitarbeiterListe) {
		int anzahlAngestellte = 0;

		for (Mitarbeiter dieserMitarbeiter : mitarbeiterListe) {
			if (dieserMitarbeiter instanceof Angestellter) {
				anzahlAngestellte++;
			}
		}

		return anzahlAngestellte;
	};

	/**
	 * @param mitarbeiterListe
	 * @return
	 */
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
