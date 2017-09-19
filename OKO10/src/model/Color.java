package model;

public enum Color {
	PIKES(Const.PIKES), CLOVERS(Const.CLOVERS), TILES(Const.TILES), HEARTS(Const.HEARTS);

	private final String label;

	public String getLabel() {
		return this.label;
	}

	Color(String label) {
		this.label = label;
	}
}
