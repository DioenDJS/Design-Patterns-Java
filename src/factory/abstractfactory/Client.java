package factory.abstractfactory;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.factory.AbstractFactoryMadeira;
import factory.abstractfactory.factory.AbstractFactoryMetal;
import factory.abstractfactory.factory.AbstractFactoryPlastico;
import factory.abstractfactory.model.Cadeira;
import factory.abstractfactory.model.Porta;
import factory.abstractfactory.model.Quadro;

public class Client {
    public static void create(AbstractFactory factory){

        Cadeira cadeira = factory.criacaoCadeira();
        Quadro quadro = factory.criacaoQuadro();
        Porta porta = factory.criacaoPorta();

        System.out.println("================= "+ factory.getClass().getSimpleName() + " =============================================");
        cadeira.criandoObjeto();
        System.out.println(cadeira.objetoPronto());

        quadro.criandoObjeto();
        System.out.println(quadro.objetoPronto());

        porta.criandoObjeto();
        System.out.println(porta.objetoPronto());

    }
    public static void main(String[] args) {

        create(new AbstractFactoryMadeira());
        create(new AbstractFactoryMetal());
        create(new AbstractFactoryPlastico());

    }
}
