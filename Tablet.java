public class Tablet {
    private String marca;
    private double preco;
    private int capacidade;
    private String sistema;

    public Tablet(String marca, double preco, int capacidade) {
        this.marca = marca;
        this.preco = preco;
        this.capacidade = capacidade;
        this.sistema = "Android";
    }

    public Tablet(String marca, double preco, int capacidade, String sistema) {
        this.marca = marca;
        this.preco = preco;
        this.capacidade = capacidade;
        this.sistema = sistema;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getSistema() {
        return sistema;
    }


}
