package factory;

import factory.Shape.Shapes;



public class ShapeFactory {
	public Shape createShape(Shapes name){
		switch(name){
		case TRIANGLE :
			return new Triangle();
//			break;
		case SQUARE :
			return new Square();
//			break;
		default:
			return new Shape(){
				public void draw(){
					System.out.println("CAUTION: unknown shape");
				}
			};
		}
	}

	public Shape createShape(String triangle) {
		// TODO Auto-generated method stub
		return new Triangle();
	}

//	public Shape createShape(Shapes triangle) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
