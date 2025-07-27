package factory.factorymethod.model;

public class Porta implements Madeira {

    private String porta;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("separando madeira");
        System.out.println("tratando material");
        System.out.println("linha de montagem");
        setPorta("Porta Pronta");

    }

    @Override
    public String objetoPronto() {
        return getPorta();
    }
}
