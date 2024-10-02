package example.factory;

public class MainApp
{

    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
