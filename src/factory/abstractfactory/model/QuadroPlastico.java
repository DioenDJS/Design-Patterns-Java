package factory.abstractfactory.model;

public class QuadroPlastico implements Quadro {

    private String quadro;

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("inserindo plástico derretido no molde");
        System.out.println("esperando secagem");
        System.out.println("linha de montagem");
        setQuadro("Quadro Pronta");

    }

    @Override
    public String objetoPronto() {
        return getQuadro();
    }
}
