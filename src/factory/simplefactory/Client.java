package factory.simplefactory;

import factory.simplefactory.factory.MadeiraSimpleFactory;

import factory.simplefactory.model.Madeira;

public class Client {
    public static void main(String[] args) {
        Madeira simpleFactoryCadeiraMadeira = MadeiraSimpleFactory.criandoExportadorDeArquivos("cadeira");
        System.out.println(simpleFactoryCadeiraMadeira.objetoPronto());

        Madeira simpleFactoryPortaMadeira = MadeiraSimpleFactory.criandoExportadorDeArquivos("porta");
        System.out.println(simpleFactoryPortaMadeira.objetoPronto());

        Madeira simpleFactoryQuadroMaceira = MadeiraSimpleFactory.criandoExportadorDeArquivos("quadro");
        System.out.println(simpleFactoryQuadroMaceira.objetoPronto());

    }
}
