package abstract_factory;

import abstract_factory.Interfaces.Cutlery;
import abstract_factory.Interfaces.Dish;
import abstract_factory.Interfaces.FoodFactory;
import abstract_factory.cutleries.Fork;
import abstract_factory.food.Pizza;

public class AmericanFactory implements FoodFactory {

	@Override
	public Dish getFood() {
		return new Pizza();
	}

	@Override
	public Cutlery getCutlery() {
		return new Fork();
	}

}
