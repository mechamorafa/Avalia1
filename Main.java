import java.util.Scanner;
public class Main {

    private CadastroGeral cg;
    private Venda[] vendas;
    private Tablet[] tablets;

    public static void main(String[] args) {
        Main m = new Main();
        m.Inicializar();
        m.Processar();
    }

    public void Inicializar(){
        cg = new CadastroGeral();
        vendas = new Venda[10];
        tablets = new Tablet[10];

        // Cadastro de Tablets:
        tablets[0] = new Tablet("LG", 699, 64, "Android");
        tablets[1] = new Tablet("Samsung", 1099, 128, "Android");
        tablets[2] = new Tablet("Sony", 999, 256, "Android");
        tablets[3] = new Tablet("Apple", 3099, 256, "iOS");
        tablets[4] = new Tablet("Multilaser", 299, 64, "Android");

        // Cadastro de Vendas:
        vendas[0] = new Venda(0001, "Carl Sagan", tablets[1]);
        vendas[1] = new Venda(0002, "Neil deGrasse Tyson", tablets[3]);
        vendas[2] = new Venda(0003, "Michio Kaku", tablets[3]);

    }

    public void Processar() {
        Scanner in = new Scanner(System.in);
        int opcaoMenu;
        int pesquisaPorCodigo;
        String pesquisaPorMarca;


        do{
            System.out.println("\tACMEEletronics:");
            System.out.println("1. Mostrar todas as informações de vendas cadastradas");
            System.out.println("2. Pesquisar venda pelo código");
            System.out.println("3. Pesquisar vendas pela marca");
            System.out.println("0. Sair");
            System.out.println("Opcao:");
            opcaoMenu = in.nextInt();

            switch(opcaoMenu){
                case 0:
                    System.out.println("Programa encerrado! Até mais! ;)");
                    break;
                case 1:
                    cg.PesquisaTudo(vendas);
                    break;

                case 2:
                    System.out.println("Pesquisa por código: ");
                    pesquisaPorCodigo = in.nextInt();

                    cg.Pesquisa(vendas, pesquisaPorCodigo);
                    break;

                case 3:
                    System.out.println("Pesquisar por marca: ");
                    pesquisaPorMarca = in.next();

                    cg.Pesquisa(vendas, pesquisaPorMarca);
                    break;


                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcaoMenu != 0);

    }

}