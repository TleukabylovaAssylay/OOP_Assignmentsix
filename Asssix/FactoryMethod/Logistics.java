package Asssix.FactoryMethod;

public abstract class Logistics implements Transport {
    public void deliver(){
        Transport t= this.create();
    }
    public abstract Transport create();
}
