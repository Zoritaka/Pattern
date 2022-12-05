package FactoryMethod;
import FactoryMethod.SmartPhone;
public class Iphone extends SmartPhone {
    private String modelName;

    Iphone(String modelName){
        this.modelName = modelName;
    }

    @Override
    public String getModelName() {
        return this.modelName;
    }
}