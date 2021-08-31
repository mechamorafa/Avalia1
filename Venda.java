public class Venda {
    private int codigo;
    private String comprador;
    private Tablet tablet;

    public Venda(int codigo, String comprador, Tablet tablet) {
        this.codigo = codigo;
        this.comprador = comprador;
        this.tablet = tablet;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getComprador() {
        return comprador;
    }


    public Tablet getTablet() {
        return tablet;
    }


}
