package jplsemfive.exp5.inheritance_v2;

import java.util.*;

public class Diagram {
    private Shape[] shapes;
    
    public Diagram(Shape... shapes) {
        this.shapes = shapes; 
    }

    public Shape[] getShapes() {
        return shapes; 
    }

    public double totalArea(){
        double totalArea = 0.0;
        for (Shape shape : shapes){
            totalArea += shape.area();
        }
        return totalArea;
    }
}
