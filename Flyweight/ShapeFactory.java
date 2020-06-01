package pattern.Flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String,Shape>circlemap=new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle=(Circle)circlemap.get(color);

        if (circle==null){
            circle=new Circle(color);
            circlemap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
