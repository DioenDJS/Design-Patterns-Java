package factory.abstractfactory.model;

public class CadeiraMetal implements Cadeira {

    private String cadeira;

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("separando chapas de aço");
        System.out.println("linha de montagem");
        setCadeira("Cadeira Pronta");

    }

    @Override
    public String objetoPronto() {
        return getCadeira();
    }
}
