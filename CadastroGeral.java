public class CadastroGeral {
    private Venda vendas[];
    private Tablet tablets[];


    public void Cadastra(Tablet[] tablets, Tablet tablet){


    }

    public void Cadastra(Venda[] vendas, Venda venda){

    }

    public static void PesquisaTudo(Venda[] vendas) {
        System.out.println("===================================");
        System.out.println("Todas as vendas cadastradas:");
        System.out.println("===================================");

        for (int i=0; i<10;i++){
            if(vendas[i]!=null){
            Tablet res = vendas[i].getTablet();
            System.out.println("Código: " + vendas[i].getCodigo() + " | Comprador: " + vendas[i].getComprador() + " | Tablet: " + res.getMarca() + "/" + res.getCapacidade() + "/" + res.getSistema() + " | Preço: R$ " + res.getPreco());
            }
        }

    }

    public static void Pesquisa(Venda[] vendas, int codigo) {

        int contador = 0;

        Venda[] resultado = new Venda[10];

            for (int i = 0; i < 10; i++) {
                if(vendas[i]!=null){
                    int comparaCodigo = vendas[i].getCodigo();
                    if (comparaCodigo == codigo) {
                        resultado[contador] = new Venda(vendas[i].getCodigo(), vendas[i].getComprador(), vendas[i].getTablet());
                        contador = contador + 1;
                    }
                }
            }

            if (contador == 0) {
                System.out.println("Nenhuma venda encontrada com este código: " + codigo);
            } else {
                for (int i = 0; i < 10; i++) {
                    if (resultado[i] != null) {
                        Tablet res = resultado[i].getTablet(); // Cria referência do objeto tablet para pegar as informações de marca/capacidade/preço
                        System.out.println("Código: " + resultado[i].getCodigo() + " | Comprador: " + resultado[i].getComprador() + " | Tablet: " + res.getMarca() + "/" + res.getCapacidade() + "/" + res.getSistema() + " | Preço: R$ " + res.getPreco());
                    }
                }
            }


    }

    public static void Pesquisa(Venda[] vendas, String marca) {

        int contador = 0;
        Venda[] resultado = new Venda[10];

        for (int i = 0; i < 10; i++) {

            if(vendas[i]!=null){
            Tablet res = vendas[i].getTablet();
            String termo = res.getMarca().toLowerCase();

            if (termo.toLowerCase().contains(marca.toLowerCase())) {
                resultado[contador] = new Venda(vendas[i].getCodigo(), vendas[i].getComprador(), vendas[i].getTablet());
                contador = contador + 1;
                }
            }
        }
        if (contador == 0) {
            System.out.println("Nenhuma venda realizada com esta marca de produto: " + marca);
        } else {
            for (int i = 0; i < 10; i++) {
                if (resultado[i] != null) {
                    Tablet res = resultado[i].getTablet(); // Cria referência do objeto tablet para pegar as informações de marca/capacidade/preço
                    System.out.println("Código: " + resultado[i].getCodigo() + " | Comprador: " + resultado[i].getComprador() + " | Tablet: " + res.getMarca() + "/" + res.getCapacidade() + "/" + res.getSistema() + " | Preço: R$ " + res.getPreco());
                }
            }
        }

    }


}