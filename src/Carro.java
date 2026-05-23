public class Carro {

    public String nome;
    public double preco;

    public Carro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
