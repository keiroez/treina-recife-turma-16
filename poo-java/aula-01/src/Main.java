/**
 * Aula 01 · Criando e usando objetos.
 * Rode este arquivo (botão ▶ ao lado do main) e compare com os slides.
 */
public class Main {
    public static void main(String[] args) {
        // new cria um objeto a partir do molde Carro
        Carro fusca = new Carro();
        fusca.modelo = "Fusca";
        fusca.cor = "laranja";

        Carro uno = new Carro();
        uno.modelo = "Uno";
        uno.cor = "verde";

        // cada objeto tem o próprio estado: acelerar o fusca não mexe no uno
        fusca.acelerar();
        fusca.acelerar();

        fusca.mostrar(); // Fusca (laranja): 20 km/h
        uno.mostrar();   // Uno (verde): 0 km/h

        // experimente: e se alguém fizer isto? (resposta na aula 02: encapsulamento)
        uno.velocidade = -50;
        uno.mostrar();
    }
}
