public class App {
 public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();
    conta.titular = "Ana";
    conta.depositar(100);
    conta.mostrar();

    conta.sacar(30);
    conta.mostrar();

    conta.sacar(500);
    conta.mostrar();
 }
}
