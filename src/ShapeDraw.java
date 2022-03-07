import java.util.Scanner;

public class ShapeDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape type: ");
        String shapeType = sc.nextLine();
        drawShape(shapeType);
    }
    public static void drawShape(String type){
        ShapeFactory shape =  new ShapeFactory();
        shape.shapeDrawn(type);
    }
}
