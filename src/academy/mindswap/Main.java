package academy.mindswap;

import academy.mindswap.fruits.Fruit;
import academy.mindswap.fruits.FruitTypes;

public class Main {
	public static void main(String[] args) {
		DupeFinder<Fruit> d = new DupeFinder<>();
		d.add(new Fruit(FruitTypes.APPLE, 1));
		d.add(new Fruit(FruitTypes.ORANGE, 1));
		d.add(new Fruit(FruitTypes.APPLE, 2));
		d.add(new Fruit(FruitTypes.ORANGE, 1));
		d.add(new Fruit(FruitTypes.APPLE, 2));
		d.add(new Fruit(FruitTypes.APPLE, 1));
		d.add(new Fruit(FruitTypes.ORANGE, 1));
		d.add(new Fruit(FruitTypes.APPLE, 2));
		d.add(new Fruit(FruitTypes.ORANGE, 1));
		d.add(new Fruit(FruitTypes.APPLE, 2));
	}
}