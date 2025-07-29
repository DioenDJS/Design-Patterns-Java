package factory.abstractfactory.factory;

import factory.abstractfactory.model.*;

public class AbstractFactoryMadeira extends AbstractFactory{
    @Override
    public Cadeira criacaoCadeira() {
        return new CadeiraMadeira();
    }

    @Override
    public Porta criacaoPorta() {
        return new PortaMadeira();
    }

    @Override
    public Quadro criacaoQuadro() {
        return new QuadroMadeira();
    }
}
