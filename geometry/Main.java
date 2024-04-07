package geometry;
import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args){

        Point point = new Point(3.5, 2.0);

        System.out.println("Współrzędne punktu: " + point.getX() + ", " + point.getY() + "\n");

        Point center = new Point (7.0, 2.0);

        ColoredCircle coloredCircle = new ColoredCircle(center, 5.0,"yellow");

        System.out.println("Współrzędne środka koła: (" + coloredCircle.getCenter().getX() +", " + coloredCircle.getCenter().getY() + ") \n");
        System.out.println("Promień koła: " + coloredCircle.getRadius() + "\n");
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter() + "\n");
        System.out.println("Pole powierzchni koła: " + coloredCircle.getArea() + "\n");
        
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}