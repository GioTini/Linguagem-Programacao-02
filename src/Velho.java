public class Velho extends Imovel {
    private double descontoNoPreco;

    public Velho(String endereco, double preco, double descontoNoPreco) {
        super(endereco, preco);
        this.descontoNoPreco = descontoNoPreco;
    }

    public double getDescontoNoPreco() {
        return descontoNoPreco;
    }

    public void setDescontoNoPreco(double descontoNoPreco) {
        this.descontoNoPreco = descontoNoPreco;
    }

    public double CalcularODesconto() {
        return getPreco() - descontoNoPreco;
    }
}
