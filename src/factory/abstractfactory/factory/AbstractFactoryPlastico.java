package factory.abstractfactory.factory;

import factory.abstractfactory.model.*;

public class AbstractFactoryPlastico extends AbstractFactory{
    @Override
    public Cadeira criacaoCadeira() {
        return new CadeiraPlastico();
    }

    @Override
    public Porta criacaoPorta() {
        return new PortaPlastico();
    }

    @Override
    public Quadro criacaoQuadro() {
        return new QuadroPlastico();
    }
}
