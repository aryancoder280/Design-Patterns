package objectFactory;

import concreteClasses.Circle;
import concreteClasses.Rectangle;
import concreteClasses.Square;
import interfaces.Shape;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		Shape shapeObject = null;
		if("Circle".equals(shapeType)) {
			shapeObject = new Circle();
		}
		else if("Square".equals(shapeType)) {
			shapeObject = new Square();
		}
		else if("Rectangle".equals(shapeType)) {
			shapeObject = new Rectangle();
		}
		return shapeObject;
	}
}
