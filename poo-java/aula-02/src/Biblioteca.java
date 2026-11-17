/**
 * Aula 02 · Atividade Biblioteca: o main que reproduz a saída do slide.
 */
public class Biblioteca {
    public static void main(String[] args) {
        Livro domCasmurro = new Livro("Dom Casmurro", "Machado de Assis");
        Livro cortico = new Livro("O Cortiço", "Aluísio Azevedo");
        Livro iracema = new Livro("Iracema", "José de Alencar");

        Leitor ana = new Leitor("Ana");
        Leitor bruno = new Leitor("Bruno");

        System.out.println("Ana pegou Dom Casmurro: " + ana.pegar(domCasmurro));     // true
        System.out.println("Bruno pegou Dom Casmurro: " + bruno.pegar(domCasmurro)); // false: emprestado
        System.out.println("Ana pegou O Cortiço: " + ana.pegar(cortico));            // true
        System.out.println("Ana pegou Iracema: " + ana.pegar(iracema));              // false: limite de 2

        ana.devolver(domCasmurro);
        System.out.println("Ana devolveu Dom Casmurro");
        System.out.println("Bruno pegou Dom Casmurro: " + bruno.pegar(domCasmurro)); // true
    }
}
