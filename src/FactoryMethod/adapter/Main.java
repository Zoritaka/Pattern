package FactoryMethod.adapter;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {
                (Shape) new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())
        };
        int x1 = 10, y1 = 20;
        int z1 = 40, k1 = 53;
        for (Shape shape : shapes){
            shape.draw(x1, y1, z1, k1);
        }
    }
}
