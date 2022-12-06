package FactoryMethod.adapter;

public class Rectangle implements Shape {
    public void draw(int x, int y, int z, int k){
        System.out.println("Line from point A(" +
                x + ";" + y + ";" + z + ";" + k + ";)");
    }

}
