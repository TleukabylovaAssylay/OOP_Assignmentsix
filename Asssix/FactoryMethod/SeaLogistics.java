package Asssix.FactoryMethod;

public class SeaLogistics extends Logistics{
    @Override
    public Transport create() {
        return new Ship(); 
    }
}
