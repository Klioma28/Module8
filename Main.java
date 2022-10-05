package Module8;

public class Main {
    public static void main(String[] args) {
        ShapeName shapeName = new ShapeName();
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Quad quad = new Quad();
        Rhombus rhombus = new Rhombus();
        Star star = new Star();
        Triangle triangle = new Triangle();

        shapeName.getShapeName(circle);
        shapeName.getShapeName(ellipse);
        shapeName.getShapeName(quad);
        shapeName.getShapeName(rhombus);
        shapeName.getShapeName(star);
        shapeName.getShapeName(triangle);
    }
}