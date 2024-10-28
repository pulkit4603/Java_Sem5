package jplsemfive.exp5.inheritance_v2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;  
        this.width = width;
    }

    public double area(){
        return length * width;
    };

    public String getInfo() {
        return "Rectangle with [Color = " + getColor() 
        + ", Length = " + length 
        + ", Width = " + width 
        + "]";
    }
}

