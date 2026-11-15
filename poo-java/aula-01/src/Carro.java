/**
 * Aula 01 · Nossa primeira classe.
 * Uma classe é o "molde": diz quais dados (atributos) e ações (métodos) os objetos terão.
 */
public class Carro {
    // atributos: o que todo carro TEM
    String modelo;
    String cor;
    int velocidade;

    // métodos: o que todo carro FAZ
    void acelerar() {
        velocidade += 10;
    }

    void frear() {
        velocidade = 0;
    }

    void mostrar() {
        System.out.println(modelo + " (" + cor + "): " + velocidade + " km/h");
    }
}
