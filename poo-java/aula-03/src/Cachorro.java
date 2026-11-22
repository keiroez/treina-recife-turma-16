/**
 * Aula 03 · Cachorro É UM Animal: herda nome, idade, comer() e emitirSom().
 */
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // primeiro a parte de Animal...
        this.raca = raca;   // ...depois o que é só do Cachorro
    }

    public String getRaca() {
        return raca;
    }

    // Bloco 2: sobrescrita. Mesmo nome e parâmetros do método de Animal.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Au au!");
    }

    // método que só cachorro tem
    public void buscarBolinha() {
        System.out.println(getNome() + " foi buscar a bolinha.");
    }
}
