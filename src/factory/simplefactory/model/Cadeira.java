package factory.simplefactory.model;

import java.util.ArrayList;
import java.util.List;

public class Cadeira implements Madeira{

    private String cadeira;

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("separando madeira");
        System.out.println("tratando material");
        System.out.println("linha de montagem");
        setCadeira("Cadeira Pronta");

    }

    @Override
    public String objetoPronto() {
        return getCadeira();
    }
}
