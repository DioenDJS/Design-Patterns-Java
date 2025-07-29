package factory.abstractfactory.model;

public class PortaPlastico implements Porta {

    private String porta;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("inserindo plástico derretido no molde");
        System.out.println("esperando secagem");
        System.out.println("linha de montagem");
        setPorta("Porta Pronta");

    }

    @Override
    public String objetoPronto() {
        return getPorta();
    }
}
