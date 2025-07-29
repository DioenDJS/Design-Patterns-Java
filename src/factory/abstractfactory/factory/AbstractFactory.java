package factory.abstractfactory.factory;

import factory.abstractfactory.model.Cadeira;
import factory.abstractfactory.model.Porta;
import factory.abstractfactory.model.Quadro;

public abstract class AbstractFactory {
    public abstract Cadeira criacaoCadeira();
    public abstract Porta criacaoPorta();
    public abstract Quadro criacaoQuadro();
}
