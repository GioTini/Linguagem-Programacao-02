public class Novo extends Imovel {
    private double adicionalNoPreco;

    public Novo(String endereco, double preco, double adicionalNoPreco) {
        super(endereco, preco);
        this.adicionalNoPreco = adicionalNoPreco;
    }

    public double getAdicionalNoPreco() {
        return adicionalNoPreco;
    }

    public void setAdicionalNoPreco(double adicionalNoPreco) {
        this.adicionalNoPreco = adicionalNoPreco;
    }

    public double CalcularOAdicional() {
        return getPreco() + adicionalNoPreco;
    }
}
