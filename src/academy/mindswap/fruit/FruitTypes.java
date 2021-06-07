package academy.mindswap.fruit;

public enum FruitTypes {
	APPLE("Apple"),
	ORANGE("Orange");

	private final String description;

	FruitTypes(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
