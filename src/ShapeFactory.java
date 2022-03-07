public class ShapeFactory {
    public Shape shapeDrawn(String shape){
        Shape drawShape = null;
        switch (shape){
            case "circle":
                drawShape = new Circle();
                drawShape.draw();
                break;
            case "square" :
                drawShape = new Square();
                drawShape.draw();
                break;
            case "rectangle" :
                drawShape = new Rectangle();
                drawShape.draw();
                break;
            default:
                System.out.println("circle ? square ? rectangle ? which one");
        } return drawShape;
    }
}
