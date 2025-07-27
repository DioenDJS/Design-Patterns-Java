package factory.factorymethod;

import factory.factorymethod.factory.FactoryMethodCadeira;
import factory.factorymethod.factory.FactoryMethodMadeira;
import factory.factorymethod.factory.FactoryMethodPorta;
import factory.factorymethod.factory.FactoryMethodQuadro;
import factory.factorymethod.model.Madeira;

public class Client {

    public static void main(String[] args) {

        FactoryMethodMadeira fabricaCadeira = new FactoryMethodCadeira();
        FactoryMethodMadeira fabricaPorta = new FactoryMethodPorta();
        FactoryMethodMadeira fabricaQuadro = new FactoryMethodQuadro();

        Madeira cadeira = fabricaCadeira.criacao();
        Madeira porta = fabricaPorta.criacao();
        Madeira quadro = fabricaQuadro.criacao();

        cadeira.criandoObjeto();
        porta.criandoObjeto();
        quadro.criandoObjeto();

        System.out.println(cadeira.objetoPronto() + "\n" + porta.objetoPronto() + "\n" + quadro.objetoPronto());
    }
}
