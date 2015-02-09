package factory;
import factory.Shape.Shapes;
public class Painter {
	ShapeFactory factory = new ShapeFactory();
	
	public static void main(String[] args) {
		Painter p = new Painter();
		Shape test = p.factory.createShape("TRIANGLE");
		Shape test2 = p.factory.createShape(Shapes.CIRCLE);
//		Shape test = p.factory.createShape(null);
		test.draw();
		test2.draw();
	}
}
//createShape