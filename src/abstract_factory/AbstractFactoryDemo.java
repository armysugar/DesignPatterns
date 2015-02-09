package abstract_factory;

import abstract_factory.Interfaces.Cutlery;
import abstract_factory.Interfaces.Dish;
import abstract_factory.Interfaces.FoodFactory;

public class AbstractFactoryDemo {
	Dish dish;
	Cutlery cutlery;
	FoodFactory factory;
	public void setFactory(FoodFactory factory){
		this.factory = factory;
	}
	public void serve(){
		dish = factory.getFood();
		cutlery = factory.getCutlery();		
		dish.serve();
		cutlery.use();
	}
	
	public static void main(String[] args) {
		AbstractFactoryDemo demo = new AbstractFactoryDemo();
		demo.setFactory(new ChineseFactory());
		demo.serve();
		demo.setFactory(new AmericanFactory());
		demo.serve();
	}
}
