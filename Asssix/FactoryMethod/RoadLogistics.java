package Asssix.FactoryMethod;

public class RoadLogistics extends Logistics{
    @Override
public Transport create() {
    return new Truck(); 
}
}