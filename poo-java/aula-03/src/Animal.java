/**
 * Aula 03 · Bloco 1: a superclasse.
 * Tudo o que é comum a qualquer animal fica aqui, escrito uma vez só.
 */
public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }
}
