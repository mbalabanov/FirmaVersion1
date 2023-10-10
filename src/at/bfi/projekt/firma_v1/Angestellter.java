package at.bfi.projekt.firma_v1;

class Angestellter extends Mitarbeiter {

	private double grundgehalt;
	private double zulage;

	public Angestellter(int id, double grundgehalt, double zulage) {
		super(id);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}

	public Angestellter(int id, String name, double grundgehalt, double zulage) {
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}

	public double getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(double grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getZulage() {
		return zulage;
	}

	public void setZulage(double zulage) {
		this.zulage = zulage;
	}

	@Override
	public String ausgabe() {
		return "\nAngestellter\n============\nId: " + getId() + "\nName: " + getName() + "\nGrundgehalt: "
				+ String.format("%.2f", grundgehalt) + "\nZulage: " + String.format("%.2f", zulage) + "\n";
	}

}
