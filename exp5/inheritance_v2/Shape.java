package inheritance_v2;

import java.util.*;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract String getInfo();
}
