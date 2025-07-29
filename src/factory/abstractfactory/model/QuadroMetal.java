package factory.abstractfactory.model;

public class QuadroMetal implements Quadro {

    private String quadro;

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("separando chapa de aço");
        System.out.println("linha de montagem");
        setQuadro("Quadro Pronta");

    }

    @Override
    public String objetoPronto() {
        return getQuadro();
    }
}
