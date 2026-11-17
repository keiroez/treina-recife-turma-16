/**
 * Aula 02 · Lab 2: testando o Produto encapsulado.
 */
public class Loja {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 120, 10);
        System.out.println("vender(3): " + teclado.vender(3));   // true
        System.out.println("vender(50): " + teclado.vender(50)); // false: só tem 7
        teclado.setPreco(-10);                                    // Preço inválido: -10.0
        teclado.mostrar();                                        // Teclado · R$ 120.0 · 7 un.
    }
}
