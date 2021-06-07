package academy.mindswap;

import academy.mindswap.fruit.Fruit;
import academy.mindswap.fruit.FruitTypes;

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