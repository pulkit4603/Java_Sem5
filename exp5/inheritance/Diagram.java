import java.util.*;

public class Diagram {
    private Shape[] shapes;
    
    public Diagram(Shape[] shapes) {
        this.shapes = shapes; 
    }

    public Shape[] getShapes() {
        return shapes; 
    }

    public totalArea(){
        double totalArea = 0.0;
        for (Shape shape : shapes){
            totalArea += shape.area();
        }
        return totalArea;
    }
}
