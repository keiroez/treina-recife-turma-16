/**
 * Aula 03 · Herança.
 * Rode este arquivo (botão ▶ ao lado do main) e compare com os slides.
 */
public class Main {
    public static void main(String[] args) {
        // bloco 1: a subclasse herda tudo o que a superclasse tem
        Cachorro rex = new Cachorro("Rex", 3, "vira-lata");
        Gato mia = new Gato("Mia", 2);
        rex.comer();        // herdado de Animal
        rex.buscarBolinha(); // só do Cachorro

        // bloco 2: sobrescrita, cada um com o seu som
        rex.emitirSom(); // Rex: Au au!
        mia.emitirSom(); // Mia: Miau!

        // labs 1 e 2: funcionários
        System.out.println("--- folha ---");
        new Funcionario("Ana", 3000).mostrar();     // Ana · R$ 3000.0
        new Gerente("Bruno", 5000, 1500).mostrar(); // Bruno · R$ 6500.0
        new Estagiario("Carla", 2000, 20).mostrar(); // Carla · R$ 1000.0

        // atividade: contas
        System.out.println("--- contas ---");
        ContaCorrente cc = new ContaCorrente("Ana", 100, 100);
        System.out.println("Corrente sacou 150: " + cc.sacar(150)); // true (saldo -50)
        System.out.println("Corrente sacou 100: " + cc.sacar(100)); // false (passaria do limite)
        System.out.println("Saldo corrente: " + cc.getSaldo());     // -50.0

        ContaPoupanca cp = new ContaPoupanca("Bruno", 100, 0.01);
        System.out.println("Poupança sacou 150: " + cp.sacar(150)); // false (sem limite)
        cp.render();
        System.out.println("Saldo poupança: " + cp.getSaldo());     // 101.0
    }
}
