package concreteClasses;

import interfaces.Shape;
import objectFactory.ShapeFactory;

public class FactoryPatternDemo {
	
	public static void main(String args[]) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape object = shapeFactory.getShape("Circle");
		object.draw();
		object = shapeFactory.getShape("Rectangle");
		object.draw();
		
	}
}
