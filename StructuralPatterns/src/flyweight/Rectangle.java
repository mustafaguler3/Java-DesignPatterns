package flyweight;

public class Rectangle extends Shape {

    private String label;

    @Override
    public void draw(int length,int breadth,String fillStyle) {
        System.out.println("Drawing a "+label+" with length "+length+ " breadth "+breadth+ " fill style "+ fillStyle);
    }

}
