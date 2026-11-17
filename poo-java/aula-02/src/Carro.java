/**
 * Aula 02 · Bloco 1: o Carro da aula 01 ganhou um construtor.
 * Agora todo carro nasce com modelo e cor. Os atributos ainda não são private:
 * proteger o Carro é o exercício 1 para casa.
 */
public class Carro {
    String modelo;
    String cor;
    int velocidade;

    // construtor: mesmo nome da classe, sem tipo de retorno, roda no new
    public Carro(String modelo, String cor) {
        this.modelo = modelo; // this.modelo = atributo; modelo = parâmetro
        this.cor = cor;
        this.velocidade = 0;
    }

    void acelerar() {
        velocidade += 10;
    }

    void mostrar() {
        System.out.println(modelo + " (" + cor + "): " + velocidade + " km/h");
    }
}
