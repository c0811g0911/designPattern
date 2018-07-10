package com.dp.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		} else if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		
		return null;
	}
}
