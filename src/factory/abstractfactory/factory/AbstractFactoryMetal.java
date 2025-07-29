package factory.abstractfactory.factory;

import factory.abstractfactory.model.*;

public class AbstractFactoryMetal extends AbstractFactory{
    @Override
    public Cadeira criacaoCadeira() {
        return new CadeiraMetal();
    }

    @Override
    public Porta criacaoPorta() {
        return new PortaMetal();
    }

    @Override
    public Quadro criacaoQuadro() {
        return new QuadroMetal();
    }
}
