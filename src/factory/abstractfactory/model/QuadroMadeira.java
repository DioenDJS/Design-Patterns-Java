package factory.abstractfactory.model;

public class QuadroMadeira implements Quadro {

    private String quadro;

    public String getQuadro() {
        return quadro;
    }

    public void setQuadro(String quadro) {
        this.quadro = quadro;
    }

    @Override
    public void criandoObjeto() {
        System.out.println("separando madeira");
        System.out.println("tratando material");
        System.out.println("linha de montagem");
        setQuadro("Quadro Pronta");

    }

    @Override
    public String objetoPronto() {
        return getQuadro();
    }
}
