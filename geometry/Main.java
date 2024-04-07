package geometry;


public class Main {
    public static void main(String[] args){

       Rectangle rectangle = new Rectangle(4.0, 5.0);

       System.out.println("Długość: " + rectangle.calculateArea() + "\n");
       System.out.println("Szerokość: " + rectangle.calculatePerimeter() + "\n");
       
    }
}