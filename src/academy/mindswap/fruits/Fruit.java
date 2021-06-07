package academy.mindswap.fruits;

import java.util.Objects;

public class Fruit {
	private final FruitTypes type;
	private final int acidity;

	public Fruit(FruitTypes type, int acidity) {
		this.type = type;
		this.acidity = acidity;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Fruit f = (Fruit) o;
		return type == f.type && acidity == f.acidity;
	}

	public int hashCode() {
		return Objects.hash(type, acidity);
	}

	public String toString() {
		return this.type.getDescription() + "(" + acidity + "), hash = " + this.hashCode();
	}
}