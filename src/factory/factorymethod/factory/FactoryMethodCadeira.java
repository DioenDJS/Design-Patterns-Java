package factory.factorymethod.factory;

import factory.factorymethod.model.Cadeira;
import factory.factorymethod.model.Madeira;

public class FactoryMethodCadeira extends FactoryMethodMadeira{

    @Override
    public Madeira criacao() {
        return new Cadeira();
    }
}
