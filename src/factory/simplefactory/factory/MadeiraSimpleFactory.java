package factory.simplefactory.factory;

import factory.simplefactory.model.Cadeira;
import factory.simplefactory.model.Madeira;
import factory.simplefactory.model.Porta;
import factory.simplefactory.model.Quadro;

public class MadeiraSimpleFactory {

    public static Madeira criandoExportadorDeArquivos(String tipoArquivo){
        Madeira objetoDeMadeira = null;
        if(tipoArquivo.equals("quadro")){
            objetoDeMadeira = new Quadro();
        } else if (tipoArquivo.equals("porta")) {
            objetoDeMadeira = new Porta();
        } else if (tipoArquivo.equals("cadeira")) {
            objetoDeMadeira = new Cadeira();
        }

        assert objetoDeMadeira != null;
        objetoDeMadeira.criandoObjeto();

        return objetoDeMadeira;
    }
}
