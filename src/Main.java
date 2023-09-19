public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Rua Batata 2012",
                63000);

        System.out.println("O imovel atual está custando: " + imovel.getPreco());
        System.out.println(" ");

        Novo imovelNovo = new Novo("Rua Banana 20",
                65000,
                6000);

        System.out.println("O imovel custa: " + imovelNovo.getPreco());
        System.out.println("Com o valor adicional ficou: " + imovelNovo.CalcularOAdicional());
        System.out.println(" ");

        Velho imovelVelho = new Velho("Rua Pamonha 34",
                54000,
                2000);

        System.out.println("O imovel custa: " + imovelVelho.getPreco());
        System.out.println("Com o desconto ficou: " + imovelVelho.CalcularODesconto());
    }
}
