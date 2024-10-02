package example.creationalDesignPatterns.factory;

public class ShapeFactory
{
    public Shape getShape(String shape) {
        switch(shape) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
