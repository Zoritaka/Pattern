package FactoryMethod.adapter;

public class LineAdapter implements Shape {
    private Line adapter;

    public LineAdapter(Line adapter){
        this.adapter = adapter;
    }
    public Line getAdapter() {
        return adapter;
    }

    public void draw(int x, int y, int z, int k){
        System.out.println("Line from point A(" +
                x + ";" + y + ";" + z + ";" + k + ";)");
    }
}
