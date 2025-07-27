package factory.factorymethod.factory;

import factory.factorymethod.model.Madeira;
import factory.factorymethod.model.Quadro;

public class FactoryMethodQuadro extends FactoryMethodMadeira{

    @Override
    public Madeira criacao() {
        return new Quadro();
    }
}
