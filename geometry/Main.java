package geometry;


public class Main {
    public static void main(String[] args){

       Square square = new Square (6.0);

       System.out.println("Pole: " + square.calculateArea() + "\n");
       System.out.println("Obwód: " + square.calculatePerimeter() + "\n");

    }
}