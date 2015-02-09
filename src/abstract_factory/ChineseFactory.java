package abstract_factory;

import abstract_factory.Interfaces.Cutlery;
import abstract_factory.Interfaces.Dish;
import abstract_factory.Interfaces.FoodFactory;
import abstract_factory.cutleries.Chopsticks;
import abstract_factory.food.Tofu;

public class ChineseFactory implements FoodFactory{
	@Override
	public Cutlery getCutlery() {
		return new Chopsticks();
	}
	
	@Override
	public Dish getFood() {
		return new Tofu();
	}
}
