/**
 * Aula 03 · Gato também É UM Animal.
 */
public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Miau!");
    }
}
