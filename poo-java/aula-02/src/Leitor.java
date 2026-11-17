/**
 * Aula 02 · Atividade Biblioteca: o Leitor pede, o Livro decide.
 * O Leitor nunca mexe no atributo disponivel do Livro (nem conseguiria: é private).
 */
public class Leitor {
    private static final int LIMITE = 2;

    private String nome;
    private int emprestados;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getEmprestados() {
        return emprestados;
    }

    public boolean pegar(Livro livro) {
        if (emprestados >= LIMITE) return false;
        if (!livro.emprestar()) return false;
        emprestados++;
        return true;
    }

    public void devolver(Livro livro) {
        if (emprestados == 0 || livro.isDisponivel()) {
            return; // nada a devolver
        }
        livro.devolver();
        emprestados--;
    }
}
