package factory.factorymethod.factory;

import factory.factorymethod.model.Madeira;
import factory.factorymethod.model.Porta;

public class FactoryMethodPorta extends FactoryMethodMadeira{

    @Override
    public Madeira criacao() {
        return new Porta();
    }
}
