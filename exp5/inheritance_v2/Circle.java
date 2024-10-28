package inheritance_v2;

public class Circle extends Shape {
    private double radius;

    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    };

    public String getInfo() {
        return "Circle with properties [Color = "+ getColor() 
        + ", radius = " + radius 
        + "]";
    }
}
