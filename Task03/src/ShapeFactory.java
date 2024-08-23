public class ShapeFactory {

    public Shape getShape(String shapeType){//if the shape type(not passing any parameter) equals to null
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){//if the shape type(passing parameter) equals to square and ignore case-sensitive
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {//if the shape type(passing parameter) equals to circle and ignore case-sensitive
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {//if the shape type(passing parameter) equals to rectangle and ignore case-sensitive
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {//if the shape type(passing parameter) equals to triangle and ignore case-sensitive
            return new Triangle();
        }
        else //if the passing parameter not equals to above types of shapes
            return new InvalidShape();
    }
}
