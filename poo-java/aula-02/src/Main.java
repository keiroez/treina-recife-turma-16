/**
 * Aula 02 · Construtores e encapsulamento.
 * Rode este arquivo (botão ▶ ao lado do main) e compare com os slides.
 */
public class Main {
    public static void main(String[] args) {
        // bloco 1: com construtor, o objeto já nasce completo
        Carro fusca = new Carro("Fusca", "laranja");
        Carro uno = new Carro("Uno", "verde");
        fusca.acelerar();
        fusca.mostrar(); // Fusca (laranja): 10 km/h
        uno.mostrar();   // Uno (verde): 0 km/h

        // bloco 2: o saldo só muda pelos métodos, que conferem as regras
        ContaBancaria conta = new ContaBancaria("Ana", 100);
        System.out.println("sacar(30): " + conta.sacar(30));   // true
        System.out.println("sacar(500): " + conta.sacar(500)); // false
        System.out.println("saldo: " + conta.getSaldo());      // 70.0

        // experimente tirar o comentário: não compila, porque saldo é private
        // conta.saldo = 1000000;
    }
}
