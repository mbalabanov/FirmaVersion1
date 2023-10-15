package at.bfi.projekt.firma_v1;

class Angestellter extends Mitarbeiter {

	private double grundgehalt;
	private double zulage;

	public Angestellter() {
	}

	/**
	 * @param id
	 */
	public Angestellter(int id) {
		super(id);
	}

	/**
	 * @param id
	 * @param name
	 * @param grundgehalt
	 * @param zulage
	 */
	public Angestellter(int id, String name, double grundgehalt, double zulage) {
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
	}

	/**
	 * @return
	 */
	public double getGrundgehalt() {
		return grundgehalt;
	}

	/**
	 * @param grundgehalt
	 */
	public void setGrundgehalt(double grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	/**
	 * @return
	 */
	public double getZulage() {
		return zulage;
	}

	/**
	 * @param zulage
	 */
	public void setZulage(double zulage) {
		this.zulage = zulage;
	}

	@Override
	public String ausgabe() {
		return "\nAngestellter\n============\nId: " + getId() + "\nName: " + getName() + "\nGrundgehalt: "
				+ String.format("%.2f", grundgehalt) + "\nZulage: " + String.format("%.2f", zulage) + "\n";
	}

}
