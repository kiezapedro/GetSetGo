// A simple class Shape which provides a method to get the Shape's area
class Shape{
    public double getArea(){
        return 0;
    }
}
// A right angle with base and height
class RightAngle extends Shape{ // extended from the Shape class
    private double base;
    private double height;
    public RightAngle(double base, double height) {
        this.base=base;
        this.height=height;
    }
    public double getArea(){ //area of right angle's 1/2*b*h
    //area using heron's formula can also be used here
        return 0.5 * base * height;
    }
}
// A SQUARE is a Shape with a specific side
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public double getArea(){
        return side * side;
    }
}

public class Area {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2]; // creating shape array of size 2
        //instead of hardcofing the input we can take input from user also
        // a switch case could be created press 1 for area of square press 2 for area of triangle
        shape[0] = new Square(5); // creating circle object at index 0
        shape [1] = new RightAngle(2,2); //creating rectangle object at index 1
        // shape object is calling children classes method
        System.out.println("Area of the Square: " + shape[0].getArea());
        System.out.println("Area of the Right Angle: " + shape[1].getArea());
    }
}
