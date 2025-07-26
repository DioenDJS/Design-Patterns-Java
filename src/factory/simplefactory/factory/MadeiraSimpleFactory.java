package factory.simplefactory.factory;

import factory.simplefactory.model.Cadeira;
import factory.simplefactory.model.Madeira;
import factory.simplefactory.model.Porta;
import factory.simplefactory.model.Quadro;

public class MadeiraSimpleFactory {

    public static Madeira criacao(String tipoDeObjeto){
        Madeira objetoDeMadeira = null;
        if(tipoDeObjeto.equals("quadro")){
            objetoDeMadeira = new Quadro();
        } else if (tipoDeObjeto.equals("porta")) {
            objetoDeMadeira = new Porta();
        } else if (tipoDeObjeto.equals("cadeira")) {
            objetoDeMadeira = new Cadeira();
        }

        assert objetoDeMadeira != null;
        objetoDeMadeira.criandoObjeto();

        return objetoDeMadeira;
    }
}
