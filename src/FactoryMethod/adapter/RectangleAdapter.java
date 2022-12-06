package FactoryMethod.adapter;

public class RectangleAdapter {
    private Rectangle adapter;
    public RectangleAdapter(Rectangle adapter){
        this.adapter = adapter;
    }
    public Rectangle getAdapter() {
        return adapter;
    }
    public void draw(int x1, int y1, int z1, int k1){

    }
}
