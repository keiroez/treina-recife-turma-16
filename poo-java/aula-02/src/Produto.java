/**
 * Aula 02 · Labs 1 e 2: uma solução do Produto encapsulado.
 */
public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        setPreco(preco); // reaproveita a regra do setter (bônus do lab 2)
        this.estoque = Math.max(0, estoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido: " + preco);
            return;
        }
        this.preco = preco;
    }

    public boolean vender(int qtd) {
        if (qtd <= 0 || qtd > estoque) {
            return false;
        }
        estoque -= qtd;
        return true;
    }

    public void repor(int qtd) {
        if (qtd <= 0) {
            return;
        }
        estoque += qtd;
    }

    public void mostrar() {
        System.out.println(nome + " · R$ " + preco + " · " + estoque + " un.");
    }
}
